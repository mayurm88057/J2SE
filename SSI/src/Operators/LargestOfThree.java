package Operators;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Three Number");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b)
{
	if(a>c)
	System.out.println(a+"a is the largest number");
	else
		System.out.println(c+ "c is the largest number");
}
else 
{
	if(b>c)
		System.out.println(b+"b is the largest number");
	else 
		System.out.println(c+"c is the largest number");
}
}

}
