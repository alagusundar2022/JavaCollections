package com.list;

import java.util.ArrayList;
import java.util.List;

public class List2 {
	public static void main(String[] args) {
		List<Integer> emp = new ArrayList<>();
		emp.add(100);
		emp.add(123);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		System.out.println(emp);
		//to check whether emp contains given value
		boolean t=emp.contains(300);
		System.out.println(t);
		int u=emp.indexOf(300);
		System.out.println(u);
		int l=emp.lastIndexOf(123);
		System.out.println(l);
		List<Integer> i=emp.subList(1, 4);
		System.out.println(i);
	}
	
}