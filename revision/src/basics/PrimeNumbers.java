package basics;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
    int num,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the range");
    num=sc.nextInt();
    if(num==0||num==1)
    	System.out.println(num+" is not a prime number");
    for(i=2;i<num;i++) {
    	if(num%i==0) {
    		System.out.println(num+"is not a prime number");
    	break;
    	}
    }
    if(i==num)
    	System.out.println(num+"is a prime number");
	}
}