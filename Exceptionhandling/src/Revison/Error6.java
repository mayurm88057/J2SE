package Revison;

public class Error6 {

	public static void main(String[] args) {
  System.out.println("FIrst line");
  int x;
  try {
	  x=10/0;
	  }
  catch(ArithmeticException e) {
	System.out.println("Inside the block");
  }
  finally {
  System.out.println("inside finally");
	}
}
	}
