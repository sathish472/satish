package com.test.pract.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class work implements Runnable{
	
	private int id;
	
	

	public work(int id) {
		this.id=id;
	}



	@Override
	public void run() {
		System.out.println("\n Task id: "+id+" thread id"+Thread.currentThread().getId());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}


public class ExecutorSer {
	public static void main(String[] args) {
		/*
		 * ExecutorService exService = Executors.newSingleThreadExecutor();
		 * 
		 * for(int i=0; i<5; i++) { exService.submit(new work(i)); }
		 * 
		 * exService.shutdown();
		 */
		
		ExecutorService exService = Executors.newFixedThreadPool(2);
	  
	  for(int i=6; i<15; i++) {
			exService.submit(new work(i));
		}
		
		exService.shutdown();
		

	}

}
