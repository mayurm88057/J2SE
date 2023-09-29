package inheritanceNOCasting1.copy;

public class TestInherit {
 public static void main(String[] args) {

	A a =new B();//upcasting
	a.m1();
	
	((B)a).m2();//downcasting 
	
	

 }}
 
 