package com.test.pract.threads;

public class Sync {
	
	public static Integer count=0;
	
	public static Integer count2=0;
	
	public static void inc()  {
		synchronized (count) {
			count++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (count2) {
				count2++;
			}
		}

	}
	public static void inc2() {
		synchronized (count2) {
			count2++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (count) {
				count++;
			}
		}

	}
	public static void main(String[] args) throws InterruptedException {
		
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<101;i++) {
					inc();
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("\n t:"+count);
				
			}
		});
		
	Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<101;i++) {
					inc2();
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("\n t2:"+count);
			}
		});
	t.start();
	t2.start();
	t.join();
	t2.join();
	System.out.println("\n Count:"+count);
	}



}
