package Revison;

public class Error2 {

	public static void main(String[] args) {
 System.out.println("first line");
 
 int x[]= {1,2,3};
 try {
 x[5]=100;
 }
 catch(ArrayIndexOutOfBoundsException e) {
   System.out.println("last line"+e);
	}
	}
	}
