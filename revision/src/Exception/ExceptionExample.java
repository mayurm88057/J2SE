package Exception;

public class ExceptionExample {
	public static void main(String[] args) {
  try { 
	  throw new NullPointerException();
	  
  }catch(ArithmeticException e) {
	  System.out.println("In AE");
  }catch(NullPointerException e) {
	System.out.println("in NPE");  
  }catch(ArrayIndexOutOfBoundsException e) {
	  System.out.println("In ArrayIOBE");
	  
  }catch(Exception e) {
  System.out.println("in Exception");
	}
}  }