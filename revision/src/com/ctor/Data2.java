package com.ctor;

public class Data2 {
	
	int i=100,j=200,k=300;
	
	// instance block or non static block  
	{ 
		System.out.println(i+ " " +j+ " "+k);
		i=33;
		j=44;
		k=55;
		
	}
	
	Data2(){
		System.out.println(i+" " +j+ " "+k);
		
	
	
	}

}