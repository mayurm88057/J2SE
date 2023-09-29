package Passingargs;

public class Test4 {
	int  a,b;
	void swap(Test4 pd) {
		int t;
		t=a;
		a=b;
		b=t;
	}

	public static void main(String[] args) {
     Test4 d1=new Test4();
     d1.a=10;
     d1.b=20;
     System.out.println("before method call");
     System.out.println("a= "+d1.a+"b= "+d1.b);
     d1.swap(d1);// pass by ref
     System.out.println("after method call");
     System.out.println("a =" +d1.a+" b = "+d1.b);
	}

}
