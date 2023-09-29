package localVocal;

public class methodcalling {
	
	public void m1(int a) {
		System.out.println("inside m1= " +a);
		
		
	}
	
	public static void main(String[] args) {
		int a=100;
		methodcalling sc=new methodcalling();
		System.out.println("insde the main = " +a);
	   sc.m1(a);
	   System.out.println("in main after call ="+a);
	}
}
	
	