/*
 * generated by Xtext 2.11.0
 */
package org.xtext.generator
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

import org.xtext.pascal.any_number
import org.xtext.pascal.block
import org.xtext.pascal.constant
import org.xtext.pascal.expression
import org.xtext.pascal.expression_list
import org.xtext.pascal.factor
import org.xtext.pascal.function_designator
import org.xtext.pascal.program
import org.xtext.pascal.simple_expression
import org.xtext.pascal.statement
import org.xtext.pascal.statement_sequence
import org.xtext.pascal.term
import org.xtext.validation.ElementType
import org.xtext.validation.Function
import org.xtext.validation.PascalValidator
import org.xtext.validation.Procedure
import org.xtext.validation.Type
import org.xtext.validation.TypeInferer
import org.xtext.validation.Variable
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PascalGenerator implements IGenerator2  {
	
	private HashMap<String, String> stringTable = new HashMap<String, String>();
	private int labelCount;
	private int conditionalLabelCount;
	private int caseLabelCount;
	private int caseGlobalLabelCount;
	private String reg1;
	private String reg2;
	private String reg3;
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (e: resource.allContents.toIterable.filter(program)) {
			labelCount = 0;
			conditionalLabelCount = 0;
			caseLabelCount = 0;
			caseGlobalLabelCount = 0;
			stringTable.clear();
			fsa.generateFile(e.heading.name + ".asm", e.compile);
		}
	}
	
	def setReg1(String address){
		this.reg1 = address;
	}
	
	def setReg2(String address){
		this.reg2 = address;
	}
	
	def setReg3(String address){
		this.reg3 = address;
	}

	def createStringTable(program e) {
		for (s : e.eAllContents.toIterable.filter(factor)) {
			if (s.string != null) {
				if (!stringTable.containsKey(s.string)) {
					stringTable.put(s.string, "__STRING_" + stringTable.size());
				}
			}
		}
		for (const : e.eAllContents.toIterable.filter(constant)) {
			if (const.string != null) {
				if (!stringTable.containsKey(const.string)) {
					stringTable.put(const.string, "__STRING_" + stringTable.size());
				}
			}
		}
	}
	
	def getName(block b) {
		var lastName = b.toString.replaceAll("org.xtext.pascal.impl.blockImpl@", "");
		return lastName;
	}
	
	def getVariables(program e) {
		var artefacts = PascalValidator.artefacts.get(e.heading.name);
		var map = artefacts.get("variables") as Map<block, Set<Variable>>;
		return map;
	}
	
	def getVariables(program e, block b) {
		return getVariables(e).get(b);
	}
	
	def getProcedures(program e) {
		var artefacts = PascalValidator.artefacts.get(e.heading.name);
		var map = artefacts.get("abstractions") as Map<block, Set<Procedure>>;
		return map;
	}
	
	def getProcedures(program e, block b) {
		return getProcedures(e).get(b);	
	}

	def getValue(Variable v) {
		if (v.value instanceof String) {
			return "'" + v.value.toString.replaceAll("'", "\"") + "'";
		} else if (v.value instanceof Boolean) {
			if (v.value.equals(true)) {
				return 1;
			} else {
				return 0;
			}
		}
		return v.value;
	}
	
	def getValue(program e, block b, constant const) {
		var variables = e.getVariables(b);
		var value = PascalValidator.getValue(const, variables);
		if (value instanceof String) {
			if (const.name == null) {
				if (stringTable.containsKey(value))
				 	return stringTable.get(value);
			} else {
				return const.name;
			}
		} else if (value instanceof Boolean) {
			if (value == true) return 1;
			return 0;
		}
		return value;
	}

	def List<Variable> getArgumentTypes(program e, block b, expression_list expList) {
		var List<Variable> list = new ArrayList<Variable>();
		if (expList == null || expList.expressions == null) return list;
		var int count = 0;
		for (expression exp : expList.expressions) {
			list.add(new Variable("arg_" + count++,  e.getType(exp), false, null, ElementType.PARAMETER));
		}
		return list;
	}
	
	def Type getType(program e, expression expr) {
		var artefacts = PascalValidator.artefacts.get(e.heading.name);
		var map = artefacts.get("calculatedTypes") as Map<EObject, Type>;
		return map.get(expr); 
	}
	
	/*TODO codigo comentado
	 * ���global _main
		
		���; Carregando constantes
		���section .data
		���	�e.createStringTable�
		���	�e.compileStrings�
		���	�e.compileAllConstants(e.block)�
			
		���; Carregando variaveis
		���section .bss
		���	�e.compileAllVariables(e.block)�
		* 
		* ; Codigo
		���section .text
	 */
	def compile(program e) '''
		; Programa �e.heading.name�		
		
		; Codigo
		�e.compileAllProcedures(e.block)�
		; Main:
		�e.compileSequence(e.block, e.block.statement.sequence)� 
		ret	; Fim do programa	
	'''
	def CharSequence compileAllProcedures(program e, block b) '''
		�e.compileProcedures(b, e.getProcedures(b))�
		�IF b.abstraction != null�
			�FOR p : b.abstraction.procedures�
				�IF p.block != null�
					�e.compileAllProcedures(p.block)�
				�ENDIF�
			�ENDFOR�
			�FOR p : b.abstraction.functions�
				�IF p.block != null�
					�e.compileAllProcedures(p.block)�
				�ENDIF�
			�ENDFOR�
		�ENDIF�
	'''
	
	def CharSequence compileAllVariables(program e, block b) '''
		�e.compileVariables(b, e.getVariables(b))�
		�IF b.abstraction != null�
			�FOR p : b.abstraction.procedures�
				�IF p.block != null�
					�e.compileAllVariables(p.block)�
				�ENDIF� 
			�ENDFOR�
			�FOR p : b.abstraction.functions�
				�IF p.block != null�
					�e.compileAllVariables(p.block)�
				�ENDIF� 
			�ENDFOR�
		�ENDIF�
	'''
	
	def CharSequence compileAllConstants(program e, block b) '''
		�e.compileConstants(b, e.getVariables(b))�
		�IF b.abstraction != null�
			�FOR p : b.abstraction.procedures�
				�IF p.block != null�
					�e.compileAllConstants(p.block)�
				�ENDIF� 
			�ENDFOR�
			�FOR p : b.abstraction.functions�
				�IF p.block != null�
					�e.compileAllConstants(p.block)�
				�ENDIF� 
			�ENDFOR�
		�ENDIF�
	'''
	
	def compileConstant(program e, block b, Variable v) '''
		�IF v.type == ElementType.CONSTANT && !v.isInherited &&
			!v.varType.realType.toLowerCase.equals("array of char")� 
				�v.name�_�getName(b)� equ �getValue(v)�
		�ENDIF�
	'''
		
	def compileString(program e, String name, String value) '''
		�value� db '�name.replaceAll("'", "")�', 0
		�value�_SIZE equ $-�value�
	'''
	
	def compileVariable(program e, block b, Variable v) '''
		�IF (v.type == ElementType.VARIABLE || v.type == ElementType.PARAMETER || 
			v.type == ElementType.FUNCTION_RETURN) && !v.isInherited� 
			�IF !v.varType.realType.toLowerCase.equals("array of char")�
				�IF v.type == ElementType.FUNCTION_RETURN�
					�v.extendedName�_�getName(b)� RESB 4
				�ELSE�
					�v.name�_�getName(b)� RESB 4
				�ENDIF�
			�ENDIF�
		�ENDIF�
	'''
	
	def compileStrings(program e) '''
		__NEW_LINE db 10, 0
		__NEW_LINE_SIZE equ $-__NEW_LINE
		__PRINTF_S db '%s', 0
		__PRINTF_I db '%d', 0
		__PRINTF_F db '%f', 0
		__BOOLEAN_TRUE db 'true', 0
		__BOOLEAN_TRUE_SIZE equ $-__BOOLEAN_TRUE
		__BOOLEAN_FALSE db 'false', 0
		__BOOLEAN_FALSE_SIZE equ $-__BOOLEAN_FALSE
		�FOR s : stringTable.keySet� 
			�e.compileString(s, stringTable.get(s))�
		�ENDFOR�
	'''
	
	def compileConstants(program e, block b, Set<Variable> variables) '''
		�FOR variable : variables�
			�e.compileConstant(b, variable)�
		�ENDFOR�
	'''
	
	def compileVariables(program e, block b, Set<Variable> variables) ''' 
		�FOR variable : variables�
			�e.compileVariable(b, variable)�
		�ENDFOR�
	'''
	 
	def CharSequence compileProcedures(program e, block b, Set<Procedure> procedures) '''
		�FOR procedure : procedures�
			�e.compileProcedure(b, procedure)�
		�ENDFOR�
	'''
	
	def CharSequence compileProcedure(program e, block b, Procedure procedure) '''
		�IF !procedure.forward && !procedure.inherited�
			; Procedure �procedure.name��procedure.parameters�
			_�procedure.extendedName�_�getName(b)�:
				�e.compileSequence(procedure.declaration.block, procedure.declaration.block.statement.sequence)�
				�IF procedure instanceof Function�
				���st eax, [�procedure.extendedName�_�getName(procedure.declaration.block)�]
				st eax, �procedure.extendedName�
				�ENDIF�
				ret ;return
				
		�ENDIF�
	'''
	
	def computeFunction(program e, block b, function_designator function) '''
		�var name = function.name�
		�var arguments = e.getArgumentTypes(b, function.expressions)�
		�var functionToSearch = new Procedure(name, arguments)�
		�var functionFound = PascalValidator.searchWithTypeCoersion(e.getProcedures(b), functionToSearch)�
		�FOR arg : functionFound.parameters�
			st edx, �arg.name�
			push edx
		�ENDFOR�
		�IF function.expressions != null && function.expressions.expressions != null�
			�var exps = function.expressions.expressions�
			�FOR i : 0..exps.size-1�
				�e.computeExpression(b, exps.get(i))�
				st �functionFound.parameters.get(i).name�, eax
			�ENDFOR�
		�ENDIF�
		call �functionFound.extendedName�
		�FOR arg : functionFound.parameters�
			pop edx
			st �arg.name�, edx
		�ENDFOR�
	'''
	
	//TODO usando um registrador temporario
	def CharSequence computeFactor(program e, block b, factor f) '''
		; computeFactor
		�IF f.string != null�
			lea eax, [�stringTable.get(f.string)�]
			st ebx, �stringTable.get(f.string)�_SIZE
		�ELSEIF f.number != null�
			�IF f.number.number.integer != null�
				st r1, �f.number.number.integer�
			�ELSE�
			�ENDIF�
		�ELSEIF f.boolean != null�
			�IF f.boolean.toLowerCase.equals("true")�
				st r1, 1
			�ELSE�
				st r1, 0
			�ENDIF�
		�ELSEIF f.variable != null�
			�var variableFound = PascalValidator.search(e.getVariables(b), new Variable(f.variable.name))�
			�IF variableFound.type == ElementType.CONSTANT�
				�IF variableFound.varType.realType.toLowerCase.equals("array of char")�
					lea eax, [�stringTable.get(variableFound.value as String)�]
					st ebx, �stringTable.get(variableFound.value as String)�_SIZE
				�ELSE�
					���st eax, �getName(variableFound.containingBlock)�_�variableFound.name�
					st eax, �variableFound.name�
				�ENDIF�
			�ELSE�
				�IF variableFound.type == ElementType.FUNCTION_RETURN�
					���st eax, [�variableFound.extendedName�_�getName(variableFound.containingBlock)�]
					st eax, �variableFound.name�
				�ELSE�
					���st eax, [�variableFound.name�_�getName(variableFound.containingBlock)�]
					st eax, �variableFound.name�
				�ENDIF�
			�ENDIF�
		�ELSEIF f.function != null�
			�e.computeFunction(b, f.function)�
		�ELSEIF f.expression != null�
			�e.computeExpression(b, f.expression)�
		�ELSEIF f.not != null�
			�e.computeFactor(b, f.not)�
			xor eax, 1 ; Logical not
		�ENDIF�
	'''
	//TODO push ecx removido
	def computeTerm(program e, block b, term t) '''
		�e.computeFactor(b, t.factors.get(0))�
		; computeTerm1
		�IF t.operators != null�
			�var int index = 1�
			�FOR operator : t.operators�
				st ecx, eax
				�e.computeFactor(b, t.factors.get(index++))�
				; computeTerm2
				�IF operator.toLowerCase.equals("and")�
					and ecx, eax ; Logical And
				�ELSEIF operator.toLowerCase.equals("mod")�
					st edx, eax ; Module
					st eax, ecx
					st ecx, edx
					cdq
					idiv ecx
					st ecx, edx
				�ELSEIF operator.toLowerCase.equals("div") || operator.equals("/")�
					st edx, eax ; Divide
					st eax, ecx
					st ecx, edx
					cdq
					idiv ecx
					st ecx, eax
				�ELSEIF operator.equals("*")�
					mul ecx ; Multiply
					st ecx, eax
				�ENDIF�
				st eax, ecx
			�ENDFOR�
		�ENDIF�
		���pop ecx
	'''
	
	//TODO push ecx removido
	def computeSimpleExpression(program e, block b, simple_expression exp) '''
		�e.computeTerm(b, exp.terms.get(0) as term)�		
		; computeSimpleExpression
		�IF exp.prefixOperator != null�
			�IF exp.prefixOperator.equals("-")�
				neg aex
			�ENDIF� 
		�ENDIF�
		�IF exp.operators != null�
			�var int index = 1�
			�FOR operator : exp.operators�
				st ecx, eax
				�IF exp.terms.get(index) instanceof term�
					�e.computeTerm(b, exp.terms.get(index++) as term)�
				�ELSE�
					st eax, �(exp.terms.get(index++) as any_number).integer�
				�ENDIF�
				�IF operator.equals("or")�
					or ecx, eax ; Logical or
				�ELSEIF operator.equals("+")�
					add ecx, eax ; Sum
				�ELSEIF operator.equals("-")�
					sub ecx, eax ; Sub
				�ENDIF�
				st eax, ecx
			�ENDFOR�
		�ENDIF�
		���pop ecx
	'''
	
	//TODO push ecx removido
	def computeExpression(program e, block b, expression exp) '''
		�e.computeSimpleExpression(b, exp.expressions.get(0))�
		; computeExpression
		�IF exp.operators != null�
			�var int index = 1�
			�FOR operator : exp.operators�
				st ecx, eax
				�e.computeSimpleExpression(b, exp.expressions.get(index++))�
				cmp ecx, eax
				�IF operator.equals("=")�
					je .set_to_true�labelCount� ; Equal
					jmp .set_to_false�labelCount�
				�ELSEIF operator.equals(">")�
					jg .set_to_true�labelCount� ; Greater
					jmp .set_to_false�labelCount�
				�ELSEIF operator.equals(">=")�
					jge .set_to_true�labelCount� ; Greater or equal
					jmp .set_to_false�labelCount�
				�ELSEIF operator.equals("<")�
					jl .set_to_true�labelCount� ; Lesser
					jmp .set_to_false�labelCount�
				�ELSEIF operator.equals("<=")�
					jle .set_to_true�labelCount� ; Lesser of equal
					jmp .set_to_false�labelCount�
				�ELSEIF operator.equals("<>")�
					jne .set_to_true�labelCount� ; Different
					jmp .set_to_false�labelCount�
				�ENDIF�
				.set_to_true�labelCount�:
					st ecx, 1
					jmp .out�labelCount�
				.set_to_false�labelCount�:
					st ecx, 0
				.out�labelCount++�:
					st eax, ecx
			�ENDFOR�
		�ENDIF�
		���pop ecx
	'''
	
	def CharSequence compileSequence(program e, block b, statement_sequence sequence) '''
		�FOR stmt : sequence.statements�
			�e.compileStatement(b, stmt)�
		�ENDFOR�
	'''
	
	//TODO aqui ainda tem o registrador generico
	def CharSequence compileStatement(program e, block b, statement s) '''
		�IF s.simple != null�
			�IF s.simple.assignment != null�
				�var variableFound = PascalValidator.search(e.getVariables(b), new Variable(s.simple.assignment.variable.name))�
				; Atribuindo �s.simple.assignment.variable.name� [�setReg1(variableFound.name)� �setReg2('r1')� �setReg3('r3')�]				
				�e.computeExpression(b, s.simple.assignment.expression)�				
				�IF variableFound.type == ElementType.FUNCTION_RETURN�
					st �variableFound.name�, r1
				�ELSE�
					st �variableFound.name�, r1
				�ENDIF�
			�ELSEIF s.simple.function_noargs != null�
					; Call �s.simple.function_noargs�
					�var functionFound = PascalValidator.search(e.getProcedures(b), new Procedure(s.simple.function_noargs, new ArrayList<Variable>()))�
					call �functionFound.extendedName�
			�ELSEIF s.simple.function != null�
				; Call �s.simple.function.name�
				�e.computeFunction(b, s.simple.function)�
			�ENDIF�
		�ELSEIF s.structured != null�
			�IF s.structured.compound != null�
				; Block
				�e.compileSequence(b, s.structured.compound.sequence)�
			�ELSEIF s.structured.repetitive != null�
			
			�ELSEIF s.structured.conditional != null�
				�IF s.structured.conditional.ifStmt != null�
					; If statement
					�var ifStmt = s.structured.conditional.ifStmt�
					�e.computeExpression(b, ifStmt.expression)�
					and eax, 1 ; Setting zero flag
					�var int label = conditionalLabelCount++�
					jz .else_body�label�
					.if_body�label�:
						�e.compileStatement(b, ifStmt.ifStatement)�
						jmp .conditional_out�label�
					.else_body�label�:
						�IF ifStmt.elseStatement != null�
							�e.compileStatement(b, ifStmt.elseStatement)�
						�ENDIF�
					.conditional_out�label�:
				�ENDIF�
			�ENDIF�
		�ENDIF�
	'''
	
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
}