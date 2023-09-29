package sequence;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		double area,peri,len,width;	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for rectangle");
		
		len=sc.nextDouble();
	    width=sc.nextDouble();
	    
	    area=len*width;
	    peri=2*(len+width);
	    
	    System.out.println("area of rectangle="+area);
	    System.out.println("perimeter of rectangle="+peri);
	}

}
