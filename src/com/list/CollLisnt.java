
package com.list;

import java.util.List;
import java.util.ArrayList;

public class CollLisnt {
	public static void main(String[] args) {
		List emp = new ArrayList();
		emp.add("Alagu");
		emp.add(123);
		emp.add(10.13455f);
		emp.add(1234556789l);
		emp.add(true);
		emp.add(123);
		System.out.println(emp);
		//to get a value using index
		Object o= emp.get(2);
		System.out.println(o);
		//to find the length of emp
		int l= emp.size();
		System.out.println(l);
	}
}
