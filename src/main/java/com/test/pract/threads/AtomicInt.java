package com.test.pract.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInt {
	private static AtomicInteger counter = new AtomicInteger();
	static int c=0;
	
	public static void increment() {
		for(int i=0; i<10000;i++) {
		counter.incrementAndGet();
		c++;
		}
	}


	public static void main(String[] args) throws InterruptedException {
		
	 Thread t=new Thread(()-> { increment();});
	 Thread t2=new Thread(()-> { increment();});
	 
	 t.start();
	 t2.start();
	 
	 t.join();
	 t2.join();
	 
	 System.out.println("Atomic:"+counter.get());
	 System.out.println("int:"+c);
		
	}

}
