package Operators;

import java.util.Scanner;

public class Quar2 {

	public static void main(String[] args) {
       int x,y;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the co ordinates");
       x=sc.nextInt();
       y=sc.nextInt();
       
       if(x>0 && y>0)
            System.out.println("the co ordiantes lies on 1 quadrant");
      if(x<0 && y>0)
    	  System.out.println("the point lies in the 2 quadrant");
      if(x<0 && y<0)
    	  System.out.println("the points lies in the 3 quadrant");
      if(x>0 && y<0)
    	  System.out.println("the points lies in the 4 quadrant");
      if(x!=0 && y==0)
    	  System.out.println(" the point lies on the x axis ");
      if(x==0 && y!=0)
    	  System.out.println("the point lies on the y axis");
      
     }
	
}
