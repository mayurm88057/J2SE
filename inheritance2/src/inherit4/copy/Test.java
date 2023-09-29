package inherit4.copy;

public class Test {

	public static void main(String[] args) {
   A a =new B();
   B b;

 a.a=1000;
 a.b=2000;
  b=(B)  a;
  System.out.println(b.a);
  System.out.println(b.b);
  System.out.println(b.c);
  System.out.println(b.d);
	}

}
