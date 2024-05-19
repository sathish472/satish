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
		System.out.println("\n Child thread:"+i);	
		}
		System.out.println("\n ------------------> Child thread completed");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("\n ------------------> Child thread finalize");
		super.finalize();
	}
}
	


class DeamonThread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("\n Demaon thread:"+i);	
		}
		System.out.println("\n------------------> Demaon thread completed");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("\n------------------> Demaon thread finalize");
		super.finalize();
	}
}
	
	class MyThread extends Thread{
		
		@Override
		public void run() {
			for(int i=0; i<1;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("\n My Thread class: "+i);	
			}
			System.out.println("\n ------------------> My Thread class completed");
		}
		
		@Override
		protected void finalize() throws Throwable {
			System.out.println("\n ------------------> My Thread class finalize");
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
			System.out.println("\n ------------------> My Lamda class completed");
		};
		
		Thread dt=new Thread(new DeamonThread());
		dt.setDaemon(true);
		dt.start();
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t=new Thread(r);
		t.start();
		MyThread mt=new MyThread();
		mt.start();
		try {
			mt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
