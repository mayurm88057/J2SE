package methodexamplesStatic;

public class methodexample {

	static void m1() {
		System.out.println("this is the no return");
	}
	 
	static int m2() {
		System.out.println("withe return");
	    return 10;
	}
	
	
	
	
	public static void main(String[] args) {
m1 ();
int x=m2();
System.out.println(x);
System.out.println(m2());
	}

}
