package com.list;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List<Integer> emp = new ArrayList<>();
		emp.add(100);
		emp.add(123);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		System.out.println(emp);
		//to insert a value using index
		emp.add(1, 2000);
		System.out.println(emp);
		//to remove a value using index
		emp.remove(2);
		System.out.println(emp);
		//to replace a value using index
		emp.set(1, 1000);
		System.out.println(emp);
	}
}

