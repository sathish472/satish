package com.test.pract.threads;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunication {

	public Object lock = new Object();
	Queue<String> messages=new LinkedList<>();
	boolean isWriting=false;
	
	public void produce() throws InterruptedException {
		synchronized (lock) {
			isWriting=true;
			int i=1;
			while(true) {
				Thread.sleep(1000);
			if(isWriting) {
			System.out.println("\n Sending message");
			messages.add("Message"+i);
			System.out.println("\n Message sent");
			isWriting=false;
			i++;
			lock.notify();
			}else {
				lock.wait(100);
				System.out.println("\n Waiting for reading message");
			}
			}
		}
	}
		
		public void consume() throws InterruptedException {
			synchronized (lock) {
				while(true) {
					Thread.sleep(100);
			    if(!isWriting) {
				System.out.println("\n Reading message");
				System.out.println("\n Message received:"+messages.remove());
				isWriting=true;
				lock.notify();
			   }else {
				   lock.wait(1000);
				   System.out.println("\n Waiting for writing message"); 
			   }
				}
			}
		
	}
	
	
	public static void main(String[] args) {
		InterThreadCommunication i=new InterThreadCommunication();
		
		Thread t=new Thread(()-> {
			try {
				i.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread t2=new Thread(()-> {
			try {
				i.consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t.start();
		t2.start();
	}

}
