package Revison;

public class Error {

	public static void main(String[] args) {
  System.out.println("First line");
  int x;
  try {
  x=10/0;
  }
  catch(ArithmeticException e) {
 System.out.println("inside the "+e);
  }
  
  System.out.println("second line");
	}

}
