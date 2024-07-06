package com.test.pract.ref;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import com.fasterxml.jackson.databind.JsonMappingException.Reference;

public class RefEx {

	public static void main(String[] args) {
		 strongRef();
		 weakRef();
		 softRef();
		photonRef();
	}
	
	public static void strongRef() {
		Emp e=new Emp();
		e.setId(1);
		e.setName("Test");
		e=null;
	}
	
	public static void weakRef() {
		Emp e=new Emp();
		e.setId(1);
		e.setName("Test");
		WeakReference<Emp> wr=new WeakReference<Emp>(e);
		System.out.println(wr.get());
		e=null;
		System.gc();
		System.out.println(wr.get());
	}
	
	public static void softRef() {
		Emp e=new Emp();
		e.setId(1);
		e.setName("Test");
	     SoftReference<Emp> sf=new SoftReference<Emp>(e);
		System.out.println(sf.get());
		e=null;
		System.gc();
		System.out.println(sf.get());
	}
	
	
	
	public static void photonRef() {
		Emp e=new Emp();
		e.setId(1);
		e.setName("Test");
		ReferenceQueue<Emp> rq=new ReferenceQueue<Emp>();
		PhantomReference<Emp> pr=new PhantomReference<Emp>(e, rq);
		System.out.println(pr.get());
	}

}
