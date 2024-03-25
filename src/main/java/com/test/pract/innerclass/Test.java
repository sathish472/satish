package com.test.pract.innerclass;




public class Test {

	int x=10;
	
	public static void main(String[] args) {
	
		Test t= new Test();
		t.m2();

	}
	
	public void m2() {
		I1 i=new I1() {
	          int x=5;
				@Override
				public void m1() {
					System.out.println(" inner x"+this.x);
					System.out.println(" outer x"+Test.this.x);
				}
				
			};
			
			i.m1();
	}
	
	
	public void m3() {
		int y=0;//final
		I1 i= () -> {
			System.out.println(" y"+y);
			//y++;
		};
		i.m1();
	}
	
	

}
