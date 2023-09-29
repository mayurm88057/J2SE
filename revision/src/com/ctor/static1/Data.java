package com.ctor.static1;

public class Data {
	
	static {
		System.out.println("inside the   static block");
		}
	static{
		System.out.println("inside the static block");
	}
	
	static
	{
		System.out.println("inside the  static block");
	}

	Data(){
		System.out.println("inside the ctor block ");

	}
	static void m1() { 
		 
	}
}
