package basics;

import java.util.Scanner;

public class GreaterOfTwo {

	public static void main(String[] args) {
   int a,b;
   Scanner sc=new Scanner(System.in);
	System.out.println("enter the rannge");
	a=sc.nextInt();
	b=sc.nextInt();
	if(a>b)
	{
	System.out.println(a+"a is the largest number");
	}
	if(b>a)
		System.out.println(b+"b is the largest number");
	
	}}
