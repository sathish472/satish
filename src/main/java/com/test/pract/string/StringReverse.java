package com.test.pract.string;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringReverse {
	
	public static void main(String[] args) {
		System.out.println(sr("saamplekl"));
	}
	
	public static void rev(String s) {
		StringBuffer sb = new StringBuffer();
		
		for(int i=s.length()-1; i>-1;i--) {
			sb.append(s.charAt(i));
		}
		
		System.out.println("-->"+sb.toString());
	}
	
	public static void revOvwelUntouched(String s) {
		char[] c = s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
			if(isOvwel(c[i])) {
				i++;
			}
			if(isOvwel(c[j])) {
				j--;
			}
			if(!isOvwel(c[i])&&!isOvwel(c[j])) {
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				i++;
				j--;
			}
			
		}
		
for(int k=0;k<c.length;k++) {
	System.out.print(c[k]);
}
	}
	
	public static boolean isOvwel(char c) {
		c=Character.toLowerCase(c);
		return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
	}
	
	public static String sr(String s) {
		
		return Arrays.stream(s.split("")).
		collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet()
		.stream()
		.peek(i -> System.out.println(i.toString()))
		.filter(i->i.getValue()>1)
		.skip(1)
		.findFirst()
		.get()
		.getKey();
		
	}

}
