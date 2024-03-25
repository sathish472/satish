package com.test.pract.methodReference;

import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		
		String s = createInstance(String::new);
	}
	
	public static <T> T createInstance(Supplier<T> s) {
		return s.get();
	}

}
