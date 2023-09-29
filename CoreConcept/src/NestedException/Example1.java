package NestedException;

public class Example1 {
	
	public static void main(String[] args) {
		try {
			int y=9/5;
			System.out.println("first error");
		
		}
			try {
				int x[]= {};
				x[2]=100;
			
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("in catch 1" +e);
			
			
		}
			catch(ArithmeticException e) {
				System.out.println("in catch" + e);
				
			}
			catch(Exception e){
				System.out.println("in exception"+ e);
				
			} 
	} }
		