package com.test.pract.threads;

class Myrunable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("\n Child thread");	
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("\n Child thread finalize");
		super.finalize();
	}
	
}


public class Thdemo {

	public static void main(String[] args) {
		Runnable r= new Myrunable();
		Runnable r1= () -> {
			for(int i=0; i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("\n Lamda thread");	
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t=new Thread(r);
		t.start();
		for(int i=0; i<5;i++) {
			try {
				Thread.sleep(50);
				System.gc();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\n P thread");
			
			}
		

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("\n Main thread finalize");
		super.finalize();
	}

}
