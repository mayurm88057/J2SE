package Passingargs;

public class Test3 {
	int a;
	public static void m1(Test3 pt) {
		pt.a=500;
	}

	public static void main(String[] args) {
    Test3 t =new Test3();
    t.a=100;
    System.out.println("before the method call =" +t.a );
	m1(t);
	System.out.println("after method call a= "+t.a);
	}

}
