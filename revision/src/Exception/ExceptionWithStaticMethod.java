package Exception;

public class ExceptionWithStaticMethod {
	
 static void m1() {
	 System.out.println("in main");
	 m2();
	 
 }
 static void m2() {
	 System.out.println("in m2");
    try {
    	throw new RuntimeException();
    	}catch(Exception e) {
    		System.out.println("inside the m2 ");
    	throw e;
    	}
    	}
 public static void main(String[] args) {
	System.err.println("in main");
	m1();
}
 }