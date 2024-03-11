package com.test.pract.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("B",2));
		list.add(new Student("A",1));
		
		//Collections.sort(list, new MyCompator<Student>());
		
		Collections.sort(list);
		
		System.out.println(list.toString());
		
		
		List<Integer> noList = new ArrayList<>();
		
		noList.add(new Integer(1));
		noList.add(new Integer(2));
		noList.add(new Integer(3));
		noList.add(new Integer(4));
		noList.add(new Integer(4));
		
		//Collections.sort(noList, new IntDesc<>());
		
		Collections.sort(noList, (I1, I2) -> I2-I1);
		
		System.out.println("\n no: "+noList);
		
		Set<Integer> ts=new TreeSet<Integer>();
		
		Throwable t;
		
		
		
		
		

	}
	
	protected void finalize() throws Throwable {

		super.finalize();
	}

}
