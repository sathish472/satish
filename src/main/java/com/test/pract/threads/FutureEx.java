package com.test.pract.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Worker implements Callable<String>{
	
	private int id;
	
	public Worker(int id) {
		this.id=id;
	}

	@Override
	public String call() throws Exception {
		int time =(-(id-10))*1000;
		System.out.println(id+" Sleeping for "+time);
	   Thread.sleep(time);
	   System.out.println("Excetion completed "+id);
	return "Done "+id;
	}
	
}


public class FutureEx {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService exs=Executors.newFixedThreadPool(3);
		List<Future<String>> fl=new ArrayList<Future<String>>();
		for(int i=1;i<=10;i++) {
			System.out.println("Submitted task "+i);
			Future<String> f=exs.submit(new Worker(i));
			fl.add(f);
		}
		int i=1;
		for(Future<String> f:fl) {
			System.out.println(i+" for loop");
			i++;
			System.out.println("Message "+f.get());
		}
		exs.shutdown();

	}
	

}
