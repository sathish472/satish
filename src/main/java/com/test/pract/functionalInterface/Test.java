package com.test.pract.functionalInterface;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		int[] x= {1,12,3,14,5,6,7};
		
		Predicate<Integer> p1 = (i)-> i>10;
		
		Predicate<Integer> p2 = (i)-> i%2==0;
		
		System.out.println("\n >10");
		m1(p1,x);
		
		System.out.println("\n even");
		m1(p2,x);
		
		System.out.println("\n p1 and p2");
		m1(p1.and(p2),x);
		
		System.out.println("\n p1 or p2");
		m1(p1.or(p2),x);
		
		
		System.out.println("\n odd");
		m1(p2.negate(),x);
	}
	
	public static void m1(Predicate<Integer> p, int[] x) {
		
		for(int i=0;i<x.length;i++) {
		    if(p.test(x[i])) {
		    	System.out.println("\n "+x[i]);
		    }
		}
		
	}

}
