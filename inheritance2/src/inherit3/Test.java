package inherit3;

public class Test {
public static void main(String[] args) {
 // parent refers /points to child object 
	A a =new B(); // upcasting
	// child refers /points to parents object 
B b=(B) new A();// down casting 

}}
