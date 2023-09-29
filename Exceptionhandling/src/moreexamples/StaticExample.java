package moreexamples;

public class StaticExample {
	
	static void m1() {
		System.out.println("in m1");
		m2();
	}
       static void m2() {
    	   System.out.println("in m2");
       try {
    	   throw new RuntimeException();
       }catch (Exception e) {
       System.out.println("inside catch of m2");
       throw e; // re throw
       }
       }
	public static void main(String[] args) {
    System.out.println("in main");
	m1();
	
	}

}
