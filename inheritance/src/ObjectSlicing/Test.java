package ObjectSlicing;

public class Test {

	public static void main(String[] args) {
       // A a = new A();
  		A a;
		B b = new B();
		
		b.a=100;
		b.b=200;
		b.c=300;
		b.d=500;
	    a = b; // Object Slicing hota hai ye 
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println();

	}

}
