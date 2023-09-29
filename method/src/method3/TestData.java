package method3;

public class TestData {

	public static void main(String[] args) {
 
		 Data d1 =new Data();
		 System.out.println("before");
		 System.out.println(d1.getx());
	    System.out.println(d1.gety());
		 System.out.println(d1.getz());
		// d1.x=100;
		 
		d1.setx(10);
		d1.sety(20);
		d1.setz(30);
		  
		System.out.println("After");
	 System.out.println(d1.getx());
		 System.out.println(d1.gety());
		  System.out.println(d1.getz());

		 
		 
	}

}
