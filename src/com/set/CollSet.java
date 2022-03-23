package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollSet {
	public static void main(String[] args) {
		Set<Integer> t= new TreeSet<>();
		t.add(100);
		t.add(200);
		t.add(300);
		t.add(400);
		t.add(500);
		t.add(100);
		System.out.println(t);
		
		Set<Integer> t1= new TreeSet<>();
		t1.add(100);
		t1.add(200);
		t1.add(300);
		t1.add(400);
		t1.add(600);
		System.out.println(t1);
		boolean a=t.containsAll(t1);
		System.out.println(a);
		boolean e=t1.isEmpty();
		System.out.println(e);
		t.remove(200);
		System.out.println(t);
		//t.removeAll(t1);
		//System.out.println(t);
		
		t.retainAll(t1);
		System.out.println(t);
		
	
		int i = t.size();
		System.out.println(i);
		boolean c=t.contains(300);
		System.out.println(c);
		t.clear();
		System.out.println(t);
		
	
	}
}
