package com.list;

import java.util.ArrayList;
import java.util.List;

public class List4 {
	public static void main(String[] args) {
		List<Integer> emp = new ArrayList<>();
		emp.add(100);
		emp.add(200);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		System.out.println(emp);
		List<Integer> emp1 = new ArrayList<>();
		//to add all value from emp to emp1
		emp1.addAll(emp);
		System.out.println(emp1);
		
}
}
