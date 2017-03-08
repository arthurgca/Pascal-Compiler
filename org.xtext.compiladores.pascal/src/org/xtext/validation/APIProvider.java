package org.xtext.validation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class APIProvider {	
	
	private final static String REAL = "real";
	private final static String INTEGER = "integer";
	private final static String SHORT_INT = "shortint";
	private final static String LONG_INT = "longint";
	private final static String BOOLEAN = "boolean";
	private final static String NUMERIC = "numeric";
	private final static String CHAR = "char";
	private final static String REFLECT = "reflect";
	private final static String ENUMERATED = "...enumerated";

	private final static String ARRAY_OF_CHAR = "array of char";
	private final static String ARRAY_OF_INTEGER = "array of integer";
	
	
	private final static String NEWTYPE = "?";
	private final static String POINTER_NEW_TYPE = "^?";
	private final static String ARRAY_OF_NEW_TYPE = "[]?";
	
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
				newParameters[i] = REAL;
				addAbstraction(abstractions, name, returnType, newParameters);
				isVirtual = true;
			} else if (parameters[i].contains(NEWTYPE)) {
				for (Type t : getStandardTypes()) {
					String newParameterName = t.name;
					String[] newParameters = new String[parameters.length];
					System.arraycopy(parameters, 0, newParameters, 0, parameters.length);
					if (parameters[i].equals(NEWTYPE)) {
						newParameters[i] = newParameterName;
						addAbstraction(abstractions, name, returnType, newParameters); 
					} else if (parameters[i].equals(POINTER_NEW_TYPE)) {
						newParameters[i] = "^" + newParameterName; 
						addAbstraction(abstractions, name, returnType, newParameters); 
					} else if (parameters[i].equals(ARRAY_OF_NEW_TYPE)) {
						newParameters[i] = "array of " + newParameterName;
						addAbstraction(abstractions, name, returnType, newParameters);
					}
				} 
				isVirtual = true;
			}
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
	
	private static void setStandardAbstractions(Set<Procedure> it) {
		addAbstraction(it, "round", INTEGER, REAL); 
		addAbstraction(it, "chr", CHAR, INTEGER);
		addAbstraction(it, "abs", REFLECT, NUMERIC);
		addAbstraction(it, "odd", BOOLEAN, INTEGER);
		addAbstraction(it, "sqr", REFLECT, NUMERIC);
		addAbstraction(it, "sqrt", REAL, NUMERIC);
		addAbstraction(it, "sin", REAL, NUMERIC);
		addAbstraction(it, "cos", REAL, NUMERIC);
		addAbstraction(it, "arctan", REAL, NUMERIC);
		addAbstraction(it, "ln", REAL, NUMERIC);
		addAbstraction(it, "exp", REAL, NUMERIC);
		addAbstraction(it, "succ", ENUMERATED, ENUMERATED);
		addAbstraction(it, "succ", INTEGER, INTEGER);
		addAbstraction(it, "pred", ENUMERATED, ENUMERATED);
		addAbstraction(it, "pred", INTEGER, INTEGER);
		addAbstraction(it, "new", VOID, POINTER_NEW_TYPE);
		addAbstraction(it, "dispose", VOID, POINTER_NEW_TYPE);
		addAbstraction(it, "strconcat", VOID, ARRAY_OF_CHAR, ARRAY_OF_CHAR);
		addAbstraction(it, "strdelete", VOID, ARRAY_OF_CHAR, INTEGER, INTEGER);
		addAbstraction(it, "strinsert", VOID, ARRAY_OF_CHAR, ARRAY_OF_CHAR, INTEGER);
		addAbstraction(it, "strlen", INTEGER, ARRAY_OF_CHAR);
		addAbstraction(it, "strscan", INTEGER, ARRAY_OF_CHAR, ARRAY_OF_CHAR);
		addAbstraction(it, "strlen", INTEGER, ARRAY_OF_CHAR);
		addAbstraction(it, "substr", VOID, ARRAY_OF_CHAR, INTEGER, INTEGER, ARRAY_OF_CHAR);
		addAbstraction(it, "address", INTEGER, POINTER_NEW_TYPE);	
		addAbstraction(it, "length", INTEGER, ARRAY_OF_NEW_TYPE);
		addAbstraction(it, "setlength", VOID, ARRAY_OF_NEW_TYPE, INTEGER);
		addAbstraction(it, "write", VOID, NEWTYPE);
		addAbstraction(it, "write", VOID, ARRAY_OF_CHAR);
		addAbstraction(it, "write", VOID); 
		addAbstraction(it, "writeln", VOID, NEWTYPE);
		addAbstraction(it, "writeln", VOID, ARRAY_OF_CHAR);
		addAbstraction(it, "writeln", VOID);
		addAbstraction(it, "read", VOID, NEWTYPE);
		addAbstraction(it, "read", VOID, ARRAY_OF_CHAR);
		addAbstraction(it, "read", VOID);
		addAbstraction(it, "readln", VOID, NEWTYPE);
		addAbstraction(it, "readln", VOID, ARRAY_OF_CHAR);
		addAbstraction(it, "readln", VOID);
	}
	
	private static Set<Procedure> getStandardAbstractions() {
		Set<Procedure> abstractions = new HashSet<Procedure>();
		setStandardAbstractions(abstractions);
		return abstractions;
	} 
	
	private static HashSet<Type> getStandardTypes() {
		HashSet<Type> standardTypes = new HashSet<Type>();
		standardTypes.add(new Type(REAL));
		standardTypes.add(new Type(INTEGER));
		standardTypes.add(new Type(SHORT_INT));
		standardTypes.add(new Type(LONG_INT));
		standardTypes.add(new Type(BOOLEAN));
		standardTypes.add(new Type(CHAR)); 
		return standardTypes;
	}
	
}
