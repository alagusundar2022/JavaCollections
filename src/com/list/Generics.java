package com.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Generics {
	public static void main(String[] args) {
		List<Integer> emp = new Vector<>();
		emp.add(100);
		emp.add(123);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		System.out.println(emp);
		//to get a value using index
		int o= emp.get(1);
		System.out.println(o);
		//to find the length of emp
		int l= emp.size();
		System.out.println(l);
	}
}

