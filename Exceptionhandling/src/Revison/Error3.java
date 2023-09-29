package Revison;

public class Error3 {

	public static void main(String[] args) {
System.out.println("FIrst line");
	String s=null;
	try {
		s.toLowerCase();
	}
	catch(NullPointerException e) {
	System.out.println("last name"+e);
	}
	}

}
