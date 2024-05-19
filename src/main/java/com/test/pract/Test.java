package com.test.pract;

public class Test {

	public static void main(String[] args) {
		//Math m = (a, b) ->  a+b;
		//m.sum(10,20);
		
		int[] a= {1,2,3,4,5,6,7,2,5,3,10};
		/*
		 * for (int i=0;i<a.length;i++) { for(int j=0;j<a.length-i-1;j++) {
		 * if(a[j]<a[j+1]) { int temp=a[j]; a[j]=a[j+1]; a[j+1]=temp; } } } for(int
		 * i=0;i<a.length;i++) { System.out.println("--> "+a[i]); }
		 */
		//int[] a= {1,2,3,4,5,6,7,2,5,3,10};
		int big=a[0];
		int big2=0;
		for(int i=1; i<a.length;i++) {
			if(big<a[i]) {
				big2=big;
				big=a[i];
			}	
		}
		System.out.println("\n big2: "+big2);
	}
	
	

}
