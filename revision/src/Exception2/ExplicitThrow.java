package Exception2;

public class ExplicitThrow {
	public static void main(String[] args) {
	System.out.println("First line");
	Exception e=new Exception();
	try {
		throw e;
		
	}catch(Exception E) {
	
	}
	System.out.println("Second line");
	}
}