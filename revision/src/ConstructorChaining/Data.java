package ConstructorChaining;

public class Data {
	
	Data(){
		System.out.println("ctor ");
	}
	
	Data(int x){
		this();
		System.out.println("ctor with 1  parameter");
	}
	Data(int x ,int y){
		this(x);
		System.out.println("ctor with 2  parameter");
	}
	Data(int x ,int y ,int z){
		this(x,y);
		System.out.println("ctor with 3  parameter");
	}
	Data(int x ,int y ,int z,int a){
		this(x,y,z);
		System.out.println("ctor with 4  parameter");
	}
}
