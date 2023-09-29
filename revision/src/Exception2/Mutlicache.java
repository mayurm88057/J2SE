package Exception2;

import Exception.ArrayOutBoundException;

public class Mutlicache{ 
	public static void main(String[] args) {
	try {
		
	}catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException e) {
System.out.println("in e");
}
	catch(Exception e) {
		
	}
	System.out.println("error habdled");
	}}
	
