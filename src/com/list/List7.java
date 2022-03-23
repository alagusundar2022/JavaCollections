package com.list;

import java.util.ArrayList;
import java.util.List;

public class List7 {
	public static void main(String[] args) {
		List<Integer> emp = new ArrayList<>();
		emp.add(100);
		emp.add(200);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		emp.add(1000);
		System.out.println(emp);
		List<Integer> emp1 = new ArrayList<>();
		emp1.add(100);
		emp1.add(200);
		emp1.add(300);
		emp1.add(400);
		emp1.add(500);
		emp1.add(5000);
		//to remove uncommon values
		emp1.retainAll(emp);
		System.out.println(emp1);

}
}

