package methodexamplesStatic;

public class NonStatic {
   
	static void m1() {
	   System.out.println("this is method");
   }
	
	static int m2() {
		System.out.println("this is the method return ");
	return 10;
	}
	
	


public static void main(String[] args) {
	m1();
	int x =m2();
	System.out.println(x+" ");
}
}  