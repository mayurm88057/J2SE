package Methodcallandpropogation;

public class Exampleno2 {
	public static void m1() {
		System.out.println("in m1");
m2();
	}

	public static void m2()  {
		System.out.println("in m2");
try {
	m3();
} catch (Exception e) {
	System.out.println("in catch of m2");
}
	}

	public static void m3() throws Exception{

		System.out.println("in m3");
		throw new Exception();//  checked exception 
  	}

	public static void main(String[] args) throws Exception {
		System.out.println("start of main ");
		m1();
		System.out.println("end of  main ");
	}

}
