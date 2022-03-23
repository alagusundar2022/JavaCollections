package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListForLoop {
	public static void main(String[] args) {
		List<Integer> emp = new ArrayList<>();
		emp.add(100);
		emp.add(200);
		emp.add(300);
		emp.add(400);
		emp.add(500);
		emp.add(1000);
	for(int i=0; i<emp.size(); i++) {
		int j=emp.get(i);
		System.out.println(j);		
	}
	}		
}
