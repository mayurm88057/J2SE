package Operators;

import java.util.Scanner;

public class quadOfCircle {

	public static void main(String[] args) {
    int x,y,r;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the co ordinates");
    x=sc.nextInt();
    y=sc.nextInt();
    r=sc.nextInt();
    
    if(x*x+y*y>r*r)
    	System.out.println("it lies outside the circle");
    if(x*x+y*y == r*r)
    	System.out.println("it lies on the circle");
    if(x*x+y*y<=r*r)
    	System.out.println("it lies in the circle");
    if(x==0&&y==0)
    	System.out.println("it lies on the origin");
	
	}
	

}
