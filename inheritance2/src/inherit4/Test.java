package inherit4;

public class Test {

	public static void main(String[] args) {
   A a =new A();
   B b =new B(); 

   b.a=100;
   b.b=200;
   b.c=300;
   b.d=900;
   a = b; // object slicing 
   System.out.println(a.a);
	System.out.println(a.b);
	System.out.println(((B)a).c);// downcasting 
	System.out.println(((B)a).d);// downcasting
	
	}

}
