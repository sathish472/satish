package com.test.pract.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		
		set.add("A");
		set.add("B");
		set.add(new String("A"));
		
		System.out.println("\n "+set.toString());
		
		
		Set<Value> set2=new HashSet<>();
		set2.add(new Value(1));
		set2.add(new Value(1));
		set2.add(new Value(1));
		
		System.out.println("\n "+set2.toString());

	}

}
