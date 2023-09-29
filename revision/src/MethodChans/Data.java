package MethodChans;

public class Data {
	
	public void m1() {
		System.out.println("In m1"); 
		this.m2();
		
	}
	public void m2() {
		System.out.println("In m2");
	  this.m3();
	}
	public void m3() {
		System.out.println("In m3");
	 this.m4();
	}
	public void m4() {
		System.out.println("In m4");
		this.m5();
	}
	public void m5() {
		System.out.println("In m5");
	}

}
