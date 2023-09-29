package ConcerteClassInheritance;

public class TestInherit {
 public static void main(String[] args) {

	 A a=new A(); // no casting 
	 a.m1();
	 
	 ((B )a).m2();//downcasting\
	 
	// B b;
	// b=new B();
	// b.m1();
	// b.m2();
	

 }}
 
 