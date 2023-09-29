package Iteration;

import java.util.Scanner;

public class NaturalNumbers2 {

	public static void main(String[] args) {
    int i,num, temp = 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
	num=sc.nextInt();
	
	for(i=2;i<num;i++) {
		if(num%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp>0)
		System.out.println(num + " No is Prime no");
	
	else
		System.out.println(num +" No is not prime no");
	
	}}
