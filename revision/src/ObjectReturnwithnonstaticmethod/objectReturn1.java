package ObjectReturnwithnonstaticmethod;

public class objectReturn1 {
	public void m1() {
		System.out.println("in m1" +this);
		
	
	}
	
		
public static void main(String[] args) {
		objectReturn1 or =new objectReturn1();
		System.out.println(" in main " + or);
		
		or.m1();
		
		

}
}
