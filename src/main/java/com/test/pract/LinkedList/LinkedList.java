package com.test.pract.LinkedList;

public class LinkedList {
	Node head;
	
	public void inset(int id) {
		if(head==null) {
			head = new Node(id);
			System.out.println("\n head created");
		}else {
			Node current = head;
			while(current.getNext()!=null) {
				current = current.getNext();
			}
			current.setNext(new Node(id));
			System.out.println("\n Node created");
		}
		
	}
	
	void printList() {
		System.out.println("");
		Node current = head;
		while(current!=null) {
			System.out.print("["+ current.getId()+","+current.getNext()+"]");
			if(current.getNext()!=null) {
				System.out.print("--->");
			}
			current = current.getNext();
		}
		
	}
	
	void reverseList() {
		Node c = head;
		Node p =null;
		Node n=null;
		
		while(c!=null) {
			n=c.getNext();
			c.setNext(p);
			p=c;
			c=n;
		}
		
		head=p;
	}

}
