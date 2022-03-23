package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps1 {
	public static void main(String[] args) {
		Map<Integer, String> emp= new Hashtable<>();
		
		emp.put(1, "Alagu");
		emp.put(2, "Sundar");
		emp.put(3, "12345");
		emp.put(4, "Abi");
		emp.put(5, "Aks");
		emp.put(6, "");
		
		System.out.println(emp);
		//to get all entry
		Set<Entry<Integer,String>> e= emp.entrySet();	
		
		for(Entry<Integer,String> v :e) {
			System.out.println(v);
			System.out.println(v.getKey());
			System.out.println(v.getValue());
		}
	
	}
	
}
