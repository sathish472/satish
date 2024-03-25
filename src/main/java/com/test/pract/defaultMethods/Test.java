package com.test.pract.defaultMethods;

public class Test implements I1 {
	
	public void m1() {
		System.out.println("\n Overide Default Method");
	}

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.m1();
	}

}
