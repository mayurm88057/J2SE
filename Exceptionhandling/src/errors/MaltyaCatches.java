package errors;

public class MaltyaCatches {
	public static void main(String [] args) {
		System.out.println("first line");
		try {
			
		} catch(ArithmeticException|NullPointerException|ArrayIndexOutOfBoundsException e) {
	}
	
catch(Exception ee) {
System.out.println("ee");
}

}
}