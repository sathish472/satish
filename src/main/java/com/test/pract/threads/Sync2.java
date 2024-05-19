package com.test.pract.threads;

public class Sync2 {
	
	public void produce()  {
		synchronized (this) {
		System.out.println("\n Produce method executed.");
		try {
			//Thread.sleep(1000);
			wait(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n Produce method executed again");
		
	}
		
	}
	
	public void consume() {
		synchronized (this) {
			System.out.println("\n Consumer method executed");
			notify();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		Sync2 s=new Sync2();
		
		Thread t=new Thread(()->s.produce());
		
		Thread t2=new Thread(()->s.consume());
		
		t.start();
		t2.start();

	}

}
