package Iteration;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
    int num,i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
	num=sc.nextInt();
	if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }
	else{  
	
	for(i=2;i<num;i++)
	{
		if(num%i==0)
			System.out.println(num+"is not a prime number");
            break;	
	}
	
	
	}
	if(i==num)
		System.out.println(num +" is the prime number");
	}}


