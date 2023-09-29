package Exception1;

public class Exceptionex7 {
  public static void main(String[] args) {
	
	  try {
	  System.out.println("in try block");
	  throw new RuntimeException();
	  
		}
	  finally {
		  System.out.println("in finally block");
	  }
}
}
