package PassingParameter;

public class CallbyrefrenceSwap {
	
	public static void swap(Data d) {
		
		int t;
		t=d.a;
		d.a=d.b;
		d.b=t; 
		
	}
	public static void main(String [] args) {
		Data d1=new Data();
		d1.a=100; d1.b=200;
		System.out.println("before method call = "+d1.a + "b=" +d1.b);
swap(d1);
System.out.println("after method call a= "  + d1.a +"b = " +d1.b);
	}

} 
