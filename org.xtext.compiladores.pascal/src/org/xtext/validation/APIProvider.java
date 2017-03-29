package org.xtext.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class APIProvider {	
	
	private final static String INTEGER = "integer";
	private final static String BOOLEAN = "boolean";
	private final static String NUMERIC = "numeric";
	private final static String REFLECT = "reflect";
	private final static String STRING = "String";

	
	private final static String VOID = "void";


	public static final Set<Procedure> procedures = getStandardAbstractions();
	public static final Set<Type> types = getStandardTypes();
	
	private static List<Variable> getParametersWithType(String... parameters) {
		List<Variable> params = new ArrayList<Variable>();
		int count = 0;
		for (String s : parameters) {
			params.add(new Variable("arg_" + count, new Type(s), false, null, ElementType.PARAMETER));
			count++;
		}	
		return params;
	}
	
	private static void addAbstractionInAbstractions(Set<Procedure> abstractions, String name, Type returnType, String... parameters) {
		if (returnType.equals(new Type(VOID))) { 
			abstractions.add(new Procedure(name, false, null, null, getParametersWithType(parameters), true)); 
		} else {
			abstractions.add(new Function(name, false, null, null, getParametersWithType(parameters), true, returnType)); 
		}
	} 
	
	private static void addAbstraction(Set<Procedure> abstractions, String name, String returnType, String... parameters) {  
		boolean isVirtual = false;
		for (int i = 0; i < parameters.length; i++) {
			if (parameters[i].equals(NUMERIC)) {
				String[] newParameters = new String[parameters.length];
				System.arraycopy(parameters, 0, newParameters, 0, parameters.length);
				newParameters[i] = INTEGER;
				addAbstraction(abstractions, name, returnType, newParameters);
				newParameters = new String[parameters.length];
				System.arraycopy(parameters, 0, newParameters, 0, parameters.length);
				isVirtual = true;
			} 
			isVirtual = true;
		}
		if (!isVirtual)  {
			if (returnType.equals(REFLECT)) {
				if (parameters.length == 1) { 
					addAbstraction(abstractions, name, parameters[0], parameters); 
				} else {
					throw new RuntimeException("Invalid return type");
				}
			} else {
				addAbstractionInAbstractions(abstractions, name, new Type(returnType), parameters);
			}
		}
	}

	
	private static Set<Procedure> getStandardAbstractions() {
		Set<Procedure> abstractions = new HashSet<Procedure>();
		return abstractions;
	} 
	
	private static HashSet<Type> getStandardTypes() {
		HashSet<Type> standardTypes = new HashSet<Type>();
		standardTypes.add(new Type(INTEGER));
		standardTypes.add(new Type(BOOLEAN));
		standardTypes.add(new Type(STRING)); 
		return standardTypes;
	}
	
}
