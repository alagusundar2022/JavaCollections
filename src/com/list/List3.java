package com.list;

import java.util.ArrayList;
import java.util.List;

public class List3 {
	public static void main(String[] args) {
		List<Integer> emp = new ArrayList<>();
		emp.add(100);
		emp.add(200);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		System.out.println(emp);
		//to delete all value
		emp.clear();
		System.out.println(emp);
		//to check whether emp is empty
		boolean e= emp.isEmpty();
		System.out.println(e);
		
}
}