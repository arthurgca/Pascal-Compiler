package org.xtext.validation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


@SuppressWarnings("rawtypes")
public class AdaptativeHashMap<K, E extends Comparable> extends HashMap<K, Set<E>> {
 
	private static final long serialVersionUID = 1L;
	private Set<E> defaultValues;
	
	public AdaptativeHashMap() {
		this(new HashSet<E>());
	}
	
	public AdaptativeHashMap(Set<E> defaultValues) {
		this.defaultValues = defaultValues;
	}
	
	@Override
	public Set<E> get(Object key) {
		try {
			@SuppressWarnings("unchecked")
			K k = (K) key;
			if (!this.containsKey(key)) {
				this.put(k, new AdaptativeTreeSet<E>());
			}
			super.get(k).addAll(this.defaultValues);
		} catch(Exception e) { }
		return super.get(key);
	}

}
