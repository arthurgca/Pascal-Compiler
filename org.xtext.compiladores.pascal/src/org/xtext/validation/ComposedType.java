package org.xtext.validation;

public class ComposedType extends Type {

	private Type containedType;
	private ComposedTypeKind kind;
	
	public ComposedType(Type type, ComposedTypeKind kind) {
		super(type.name, type.inherited, kind == ComposedTypeKind.ARRAY ? 
				"array of " + type.getRealType() : "^" + type.getRealType());
		this.containedType = type;
		this.kind = kind;
	}

	public Type getContainedType() {
		return this.containedType;
	}
	
	public ComposedTypeKind getKind() {
		return this.kind;
	}

	@Override
	public Element clone() {
		return new ComposedType(this.containedType, this.kind);
	}

	@Override
	public String toString() {
		switch (this.kind) {
		case ARRAY:
			return this.containedType + "[]";
		case POINTER:
			return "^" + this.containedType;
		}
		return "" + this.containedType;
	}
	
}
