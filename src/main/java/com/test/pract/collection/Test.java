package com.test.pract.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("B",2));
		list.add(new Student("A",1));
		
		//Collections.sort(list, new MyCompator<Student>());
		
		Collections.sort(list);
		
		System.out.println(list.toString());
		
		

	}

}
