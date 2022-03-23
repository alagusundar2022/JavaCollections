package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEnhanse {
	public static void main(String[] args) {
		Set<Integer> t= new HashSet<>();
		t.add(100);
		t.add(200);
		t.add(300);
		t.add(400);
		t.add(500);
		System.out.println(t);
		//enhanced for loop or for each
		for(Integer g:t) {
			System.out.println(g);
		}
}
}
