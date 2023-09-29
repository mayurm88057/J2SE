 package Methodcallandpropogation;

public class Exampleno4 {
	public static void m1() {
		System.out.println("in m1");
		m2();
	}

	public static void m2() {
		System.out.println("in m2");
		try {
			m3();
		} catch (Exception e) {
			 
		}
		
		}

	

	public static void m3() throws Exception {

		System.out.println("in m3");
		try {
			throw new Exception();// checked exception
			}catch(Exception e) {
				throw new ArrayIndexOutOfBoundsException();
				
			}
		
	}

	public static void main(String[] args) {
		System.out.println("start of main ");
		m1();
		System.out.println("end of  main ");
	}

}
