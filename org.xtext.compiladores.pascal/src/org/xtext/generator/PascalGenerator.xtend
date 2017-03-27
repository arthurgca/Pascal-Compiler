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
	
	//TODO SECTION
	//--------------------------------------------------------------
	// ACCESSOR FUNCTIONS
	//--------------------------------------------------------------
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
	
	//TODO: SECTION
	//--------------------------------------------------
	// VALUE INFERER SECTION
	//--------------------------------------------------
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

	//TODO: SECTION
	//--------------------------------------------------
	// TYPE INFERER SECTION
	//--------------------------------------------------
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
	
	
	//TODO: SECTION
	//--------------------------------------------------
	// COMPILER SECTION
	//--------------------------------------------------
	def compile(program e) '''
		; Program �e.heading.name�
		global _main
		
		extern _printf
		extern _scanf 
		
		; Loading constants and strings
		section .data
			�e.createStringTable�
			�e.compileStrings�
			�e.compileAllConstants(e.block)�
			
		; Loading variables
		section .bss
			�e.compileAllVariables(e.block)�
		
		; Code
		section .text
		�e.printString�
		�e.printInteger�
		�e.printBoolean�
		�e.compileAllProcedures(e.block)�
		_main:
		�e.compileSequence(e.block, e.block.statement.sequence)� 
		ret	; Exit program
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
	
	def printString(program e) '''
		; Print string
		_print_string:
			push eax
			push ebx 
			sub esp, ebx
			mov [esp], dword eax
			call _printf
			add esp, ebx
			pop eax 
			pop ebx
			ret ;return
			
	'''
	
	def printInteger(program e) '''
		; Print integer
		_print_integer:
			push eax
			sub esp, 4
			mov [esp], eax
			sub esp, 4
			lea eax, [__PRINTF_I]
			mov [esp], eax
			call _printf
			add esp, 4
			add esp, 4
			pop eax
			ret ;return 
			
	'''
	
	def printBoolean(program e) '''
		; Print boolean
		_print_boolean:
			jnz .print_boolean_true
			push eax
			push ebx 
			�e.print("__BOOLEAN_FALSE")�
			pop eax
			pop ebx
			ret ;return
			.print_boolean_true:
			push eax
			push ebx 
			�e.print("__BOOLEAN_TRUE")�
			pop eax
			pop ebx
			ret ;return
			
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
				mov eax, [�procedure.extendedName�_�getName(procedure.declaration.block)�]
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
			mov edx, �arg.name�_�getName(functionFound.declaration.block)�
			push edx
		�ENDFOR�
		�IF function.expressions != null && function.expressions.expressions != null�
			�var exps = function.expressions.expressions�
			�FOR i : 0..exps.size-1�
				�e.computeExpression(b, exps.get(i))�
				mov [�functionFound.parameters.get(i).name�_�getName(functionFound.declaration.block)�], eax
			�ENDFOR�
		�ENDIF�
		call _�functionFound.extendedName�_�getName(functionFound.containingBlock)�
		�FOR arg : functionFound.parameters�
			pop edx
			mov [�arg.name�_�getName(functionFound.declaration.block)�], edx
		�ENDFOR�
	'''
	
	def CharSequence computeFactor(program e, block b, factor f) '''
		�IF f.string != null�
			lea eax, [�stringTable.get(f.string)�]
			mov ebx, �stringTable.get(f.string)�_SIZE
		�ELSEIF f.number != null�
			�IF f.number.number.integer != null�
				mov eax, �f.number.number.integer�
			�ELSE�
			�ENDIF�
		�ELSEIF f.boolean != null�
			�IF f.boolean.toLowerCase.equals("true")�
				mov eax, 1
			�ELSE�
				mov eax, 0
			�ENDIF�
		�ELSEIF f.variable != null�
			�var variableFound = PascalValidator.search(e.getVariables(b), new Variable(f.variable.name))�
			�IF variableFound.type == ElementType.CONSTANT�
				�IF variableFound.varType.realType.toLowerCase.equals("array of char")�
					lea eax, [�stringTable.get(variableFound.value as String)�]
					mov ebx, �stringTable.get(variableFound.value as String)�_SIZE
				�ELSE�
					mov eax, �getName(variableFound.containingBlock)�_�variableFound.name�
				�ENDIF�
			�ELSE�
				�IF variableFound.type == ElementType.FUNCTION_RETURN�
					mov eax, [�variableFound.extendedName�_�getName(variableFound.containingBlock)�]
				�ELSE�
					mov eax, [�variableFound.name�_�getName(variableFound.containingBlock)�]
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
	
	def computeTerm(program e, block b, term t) '''
		push ecx
		�e.computeFactor(b, t.factors.get(0))�
		�IF t.operators != null�
			�var int index = 1�
			�FOR operator : t.operators�
				mov ecx, eax
				�e.computeFactor(b, t.factors.get(index++))�
				�IF operator.toLowerCase.equals("and")�
					and ecx, eax ; And
				�ELSEIF operator.toLowerCase.equals("mod")�
					mov edx, eax ; Module
					mov eax, ecx
					mov ecx, edx
					cdq
					idiv ecx
					mov ecx, edx
				�ELSEIF operator.toLowerCase.equals("div") || operator.equals("/")�
					mov edx, eax ; Divide
					mov eax, ecx
					mov ecx, edx
					cdq
					idiv ecx
					mov ecx, eax
				�ELSEIF operator.equals("*")�
					mul ecx ; Multiply
					mov ecx, eax
				�ENDIF�
				mov eax, ecx
			�ENDFOR�
		�ENDIF�
		pop ecx
	'''
	
	def computeSimpleExpression(program e, block b, simple_expression exp) '''
		push ecx
		�e.computeTerm(b, exp.terms.get(0) as term)�
		�IF exp.prefixOperator != null�
			�IF exp.prefixOperator.equals("-")�
				neg aex
			�ENDIF� 
		�ENDIF�
		�IF exp.operators != null�
			�var int index = 1�
			�FOR operator : exp.operators�
				mov ecx, eax
				�IF exp.terms.get(index) instanceof term�
					�e.computeTerm(b, exp.terms.get(index++) as term)�
				�ELSE�
					mov eax, �(exp.terms.get(index++) as any_number).integer�
				�ENDIF�
				�IF operator.equals("or")�
					or ecx, eax ; Logical or
				�ELSEIF operator.equals("+")�
					add ecx, eax ; Sum
				�ELSEIF operator.equals("-")�
					sub ecx, eax ; Sub
				�ENDIF�
				mov eax, ecx
			�ENDFOR�
		�ENDIF�
		pop ecx
	'''
	
	def computeExpression(program e, block b, expression exp) '''
		push ecx
		�e.computeSimpleExpression(b, exp.expressions.get(0))�
		�IF exp.operators != null�
			�var int index = 1�
			�FOR operator : exp.operators�
				mov ecx, eax
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
					mov ecx, 1
					jmp .out�labelCount�
				.set_to_false�labelCount�:
					mov ecx, 0
				.out�labelCount++�:
					mov eax, ecx
			�ENDFOR�
		�ENDIF�
		pop ecx
	'''
	
	def print(program e, block b, function_designator function) '''
		�IF function.expressions != null�
			�e.computeExpression(b, function.expressions.expressions.get(0))�
			�IF TypeInferer.getTypeWeight(e.getType(function.expressions.expressions.get(0))) == 4�
				call _print_float
			�ELSEIF TypeInferer.getTypeWeight(e.getType(function.expressions.expressions.get(0))) >= 0�
				call _print_integer
			�ELSEIF e.getType(function.expressions.expressions.get(0)).realType.toLowerCase.equals("boolean")�
				and eax, 1 ; Setting zero flag
				call _print_boolean
			�ELSE�
				call _print_string
			�ENDIF�
		�ENDIF�
	'''
	
	def print(program e, String s) '''
		lea eax, [�s�]
		mov ebx, �s�_SIZE
		call _print_string
	'''
	
	def CharSequence compileSequence(program e, block b, statement_sequence sequence) '''
		�FOR stmt : sequence.statements�
			�e.compileStatement(b, stmt)�
		�ENDFOR�
	'''
	
	def CharSequence compileStatement(program e, block b, statement s) '''
		�IF s.simple != null�
			�IF s.simple.assignment != null�
				; Assigning �s.simple.assignment.variable.name�
				�e.computeExpression(b, s.simple.assignment.expression)�
				�var variableFound = PascalValidator.search(e.getVariables(b), new Variable(s.simple.assignment.variable.name))�
				�IF variableFound.type == ElementType.FUNCTION_RETURN�
					mov [�variableFound.extendedName�_�getName(variableFound.containingBlock)�], eax
				�ELSE�
					mov [�variableFound.name�_�getName(variableFound.containingBlock)�], eax
				�ENDIF�
			�ELSEIF s.simple.function_noargs != null�
				�IF s.simple.function_noargs.equals("writeln")�
					; Call writeln
					�e.print("__NEW_LINE")�
				�ELSE�
					; Call �s.simple.function_noargs�
					�var functionFound = PascalValidator.search(e.getProcedures(b), new Procedure(s.simple.function_noargs, new ArrayList<Variable>()))�
					call _�functionFound.extendedName�_�getName(functionFound.containingBlock)�
				�ENDIF�
			�ELSEIF s.simple.function != null�
				�IF s.simple.function.name.equals("write")�
					; Call write
					�e.print(b, s.simple.function)�
				�ELSEIF s.simple.function.name.equals("writeln")�
					; Call writeln
					�e.print(b, s.simple.function)�
					�e.print("__NEW_LINE")�
				�ELSE�
					; Call �s.simple.function.name�
					�e.computeFunction(b, s.simple.function)�
				�ENDIF�
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
				�ELSEIF s.structured.conditional.caseStmt != null�
					; Case statement
					�var caseStmt = s.structured.conditional.caseStmt�
					�var int globalLabel = caseGlobalLabelCount++�
					�e.computeExpression(b, caseStmt.expression)�
					�FOR c : caseStmt.cases�
						; Case limb
						�var int label = caseLabelCount++�
						�FOR constant : c.cases.constants�
							; Comparison with constant
							mov ecx, �e.getValue(b, constant)�
							cmp eax, ecx
							je .case_limb_body�label�
						�ENDFOR� 
						jmp .case_limb_out�label�
						.case_limb_body�label�:
							�e.compileStatement(b, c.statement)�
							jmp .case_out�globalLabel�
						.case_limb_out�label�:
					�ENDFOR�
					.case_out�globalLabel�:
				�ENDIF�
			�ENDIF�
		�ENDIF�
	'''
	
	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}
	
}