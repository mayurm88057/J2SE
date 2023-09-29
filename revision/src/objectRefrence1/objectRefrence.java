package objectRefrence1;

import PassingParameter.Data;

public class objectRefrence {
	d.a=5000;
	d.b=7000;
	public static void main(String[] args) {
		
		
		Data d1=new Data();
		d1.a=200;
		d1.b=300;
		System.out.println("before method call ");
		d1.display();
		m1(d1);
		System.out.println("after method call");
		d1.display();
		
   
	}

}
