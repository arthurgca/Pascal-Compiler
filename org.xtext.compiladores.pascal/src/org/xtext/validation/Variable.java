package org.xtext.validation;

import org.xtext.pascal.block;


public class Variable extends Element {

	private Type varType;
	private Object value;
	private Function owningFunction;
	
	public Variable(String name, Type varType, boolean inherited, block containingBlock, ElementType type, Object value) {
		super(name, type, inherited, containingBlock);
		this.varType = varType;
		this.value = value;
	}
	
	public Variable(String name, Type varType, boolean inherited, block containingBlock, ElementType type) {
		this(name, varType, inherited, containingBlock, type, type == ElementType.PARAMETER ? 0 : null);
	}
	
	public Variable(String name) {
		this(name, null, false, null, ElementType.VARIABLE, null);
	}
	
	public Type getVarType() {
		return this.varType;
	}
	 
	public Object getValue() {
		return this.value;
	}
	
	public void setValue(Object obj) {
		this.value = obj;
	}
	
	public void setOwningFunction(Function function) {
		this.owningFunction = function;
	}
	
	public Function getOwningFunction() {
		return this.owningFunction;
	}
	
	public String getExtendedName() {
		String name = this.name;
		for (Variable v : this.owningFunction.getParameters()) {
			name += "_" + v.varType.getRealType().toLowerCase();
		}
		return name;
	}
	
	@Override
	public Element clone() {
		return new Variable(this.name, this.varType, this.inherited, this.containingBlock, this.type, this.value);
	}

	//DONT MODIFY
	@Override
	public String toString() {
		return "" + this.varType;
		//return "[" + this.name + ", " + this.inherited + ", " + this.type + ", " + this.varType + "]";
	}
	 
}
