package com.test.pract.equals;

public class EQ {

	public static void main(String[] args) {
		Integer i=new Integer(1);
		Integer i2=new Integer(1);
		
		System.out.println(i.equals(i2));//true
		
		Object o=new Object();
		Object o2=new Object();
		
		System.out.println(o.equals(o2));//false
		
		String s= new String();
		String s2=new String();
		System.out.println(s.equals(s2)); //true
		

	}

}
