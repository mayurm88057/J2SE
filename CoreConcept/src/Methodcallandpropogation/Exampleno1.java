package Methodcallandpropogation;

public class Exampleno1 {
	public static void m1() throws Exception {
		System.out.println("in m1");
m2();
	}

	public static void m2() throws Exception {
		System.out.println("in m2");
m3();
	}

	public static void m3() throws Exception{

		System.out.println("in m3");
		throw new Exception();// checked exception 
	
	//	throw new RuntimeException();// unchecked exception 
  	}

	public static void main(String[] args) throws Exception {
		System.out.println("start of main ");
		m1();
		System.out.println("end of  main ");
	}

}
