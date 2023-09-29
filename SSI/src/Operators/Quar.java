package Operators;

import java.util.Scanner;

public class Quar {

	public static void main(String[] args) {
    int  x,y;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the co-ordinates");
    x=sc.nextInt();
    y=sc.nextInt();
    
    if(x>0)
    	if(y>0)
    		System.out.println("co ordinates lies on the 1 axis");
    if(x<0)
    	if(y>0)
    		System.out.println("co ordnates lies on the 2 axis");
    if(x<0)
          if(y<0)
        	  System.out.println( "co ordnates lies on the 3 axis");
    if(x>0)
    	if(y<0)
    		System.out.println("co ordnates lies on the 4 axis");
    if(x!=0)
    	if(y==0)
    		System.out.println("co ordnates lies on the x axis");
    if(x==0)
       if(y!=0)
    	   System.out.println("co ordnates lies on the y axis");
    if(x==0)
    	if (y==0)
       System.out.println("co ordnates lies on the origin");	
	}
	

}
