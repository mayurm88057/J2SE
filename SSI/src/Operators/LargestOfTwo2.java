package Operators;

import java.util.Scanner;

public class LargestOfTwo2 {

	public static void main(String[] args) {
  int n1,n2;
  Scanner sc=new Scanner(System.in);
  System.out.println("enetr the largest");
  n1=sc.nextInt();
  n2=sc.nextInt();
  if(n1>n2)
	  System.out.println(n1+"is the largest number");
  else
     System.out.println(n2+"is the largest number");
	}
	

}
