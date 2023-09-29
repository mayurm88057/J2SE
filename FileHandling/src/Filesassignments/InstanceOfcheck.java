package Filesassignments;

class A {
	class B extends A{
}
public class InstanceOfcheck {

	public static void main(String[] args) {
		InstanceOfcheck ioc = new InstanceOfcheck();
		A a = new A();
		B b =new B();
		System.out.println(a instanceof B );
		// System.out.println(ioc instanceof object);
		//System.out.println(ioc instanceof checkInstanceOfcheck);
		// System.out.println(ioc instanceof  A);
	}

}}  
