package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> emp= new HashMap<>();
		emp.put(1, "Alagu");
		emp.put(2, "Sundar");
		emp.put(3, "12345");
		emp.put(4, "Abi");
		emp.put(5, "Aks");
		System.out.println(emp);
		//to get all keys and values in emp
		Set<Integer> keys =emp.keySet();
		System.out.println(keys);
		Collection<String> o= emp.values();
		System.out.println(o);
		//to check whether emp contains kay and value
		boolean k= emp.containsKey(10);
		System.out.println(k);
		boolean v= emp.containsValue("Alagu");
		System.out.println(v);
		
		
	}
}
