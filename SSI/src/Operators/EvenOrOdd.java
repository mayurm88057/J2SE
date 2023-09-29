package Operators;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
   int num;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the the number");
   num=sc.nextInt();
   if(num%2==0)
System.out.println("is the even number");
   if(num%2!=0)
System.out.println("is the odd number");
	}

}
