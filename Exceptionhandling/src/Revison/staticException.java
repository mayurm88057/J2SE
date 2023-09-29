package Revison;

public class staticException {
	
	static void m1() throws Exception {
		System.out.println("in m1");
		m2();
	}
	static void m2() throws Exception {
		System.out.println("in m2");
m3();
	}
	
  static void m3() throws Exception {
System.out.println("in m3");	  
  m4();
  }
	static void m4() throws Exception {  
		System.out.println("in m4");
	throw new
	Exception();
	}	
		public static void main(String[] args) throws Exception {
	System.out.println("in main");
	m1();

	
	}
}
