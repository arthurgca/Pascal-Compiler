package org.xtext.validation;

import org.eclipse.emf.ecore.EStructuralFeature;

public class Error implements Comparable<Error> {

	private String message;
	private ErrorType type;
	private EStructuralFeature feature;
	
	public Error(String message, ErrorType type, EStructuralFeature feature) {
		this.message = message;
		this.type = type;
		this.feature = feature;
	}
	
	public Error(ErrorType type) {
		this(null, type, null);
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public ErrorType getType() {
		return this.type;
	}
	
	public EStructuralFeature getFeature() {
		return this.feature;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Error))
			return false;
		Error other = (Error) obj;
		return this.type == other.type;
	}
	
	@Override
	public String toString() {
		return "[" + this.type + ": " + this.message + "]";
	}

	@Override
	public int compareTo(Error o) {
		return this.type.compareTo(o.type);
	}
	
}
