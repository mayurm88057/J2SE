// instance block and initilization 
public class static1 {
	// instance block
	{
		System.out.println("in");
	}

	int a;
	int b;
	String name;
	 static1()
	 {
		 System.out.println("instane block");
	 }
	public static void main(String[] args) {
		static1 m = new static1();
		System.out.println("hello world");
		
	}
}
