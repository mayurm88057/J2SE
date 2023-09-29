package Passingargs;


public class Test2 {
	void swap(int a,int b) {
		int t;
		t=a;
		a=b;
		b=t;
	}

	public static void main(String[] args) {
		Test2 d1=new Test2();
		int a=10,b=20;
		System.out.println("before method call");
		System.out.println("a = "+a+ "b= " +b);
		d1.swap(a,b);// pass by value
		System.out.println("after method call ");
		System.out.println("a= " +a+ " b ="+b);
		

	}

}
