package PassingParameter;

public class CallbyREfrence {
	public static void m1( Data pd) {
		System.out.println("In m1 pd =" + pd);
		 
	}
	
	public static void main(String [] args) {
		Data d1=new Data();
		System.out.println("I n main d1 =" +d1);
     m1(d1);
	}

}
