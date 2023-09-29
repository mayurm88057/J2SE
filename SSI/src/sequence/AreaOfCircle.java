package sequence;

import java.util.Scanner;

public class AreaOfCircle 
{

	public static void main(String[] args) {
     double area,r,circ;
     Scanner input=new Scanner(System.in);
     System.out.println("input the value of radius");
	 r=input.nextDouble();
	 
	 area=3.1412*r*r;
	 circ=2*3.1412*r;
		
		
		System.out.println("Area of Circle = "+area);
		System.out.println("Circumfrence = "+circ);
	}

}
