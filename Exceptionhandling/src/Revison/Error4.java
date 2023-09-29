package Revison;

public class Error4 {

	public static void main(String[] args) {
 System.out.println("First line");
 try {
	 int a []=new int[1000000000];  
 }
catch(OutOfMemoryError e) {
	 System.out.println(e);
 }
 System.out.println("last line ");
	}

}
