 package method6;

public class Test {

	public static void main(String[] args) {
        Demo d=new Demo();      
		
        Demo d1=new Demo(100);
        
        Demo d2=new Demo(100,200);
        
        Demo d3=new Demo(100,200,300);
       
        System.out.println(d3 .getX());
        d3 .setX(1300);
        System.out.println(d3.getX());
	}

}
