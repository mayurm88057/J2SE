package errors; // Rethrow example 

public class RethrowEx {
	
	static void m1() {
		System.out.println("in m1");
		 try {
			  m2();
		  }catch (Exception e) {
			  System.out.println("Inside catch of m1");
              throw e;
		  }
		  
	
	}
      static void m2() {
    	  System.out.println("in m2");
    	  try {
    		  throw new RuntimeException();
    	  }catch(Exception e) {
    		  System.out.println("Inside catch of m2 block");
    	  }
      }
	public static void main(String[] args) {
  System.out.println("in main");
  try {
	  m2();
  }catch (Exception e) {
	  System.out.println("Inside catch of main");
  throw e;
  }
  
	}

}
