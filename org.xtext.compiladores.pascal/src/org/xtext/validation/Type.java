package org.xtext.validation;


public class Type extends Element {

	private String realType;
	
	public Type(String name, boolean inherited, String realType) {
		super(name, ElementType.TYPE, inherited, null);
		this.realType = realType;
	}
	
	public Type(String name) {
		this(name, false, name);
	}
	
	public String getRealType() {
		return this.realType;
	}
	
	@Override
	public Element clone() {
		return new Type(this.name, this.inherited, this.realType);
	}

	//DONT MODIFY
	@Override
	public String toString() {
		return this.name.toLowerCase();
	}

}
