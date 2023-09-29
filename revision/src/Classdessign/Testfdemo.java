package Classdessign;

public class Testfdemo {

	public static void main(String[] args) {
     Demo d1=new Demo();
     System.out.println("before get set");
     System.out.println(d1.getX());
      System.out.println(d1.getY());
      
      d1.setX(101);
      d1.setY(2010);
      
      System.out.println("after setter values are :");
        System.out.println(d1.getX());
       System.out.println(d1.getY());
	}
	}
