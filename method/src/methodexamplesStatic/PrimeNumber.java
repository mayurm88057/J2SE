package methodexamplesStatic;

import java.util.Scanner;

public class PrimeNumber {
	static void mayur() {
	int num,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :-");
	num=sc.nextInt();
	for(i=2;i<num;i++) {
		if(num%i==0) {
			System.out.println(num+"is not a prime number");
			break;
			
		}
	}
		if(i==num)
			System.out.println(num+"is a prime number");
	}
	
 public static void main(String[] args) {
    mayur();
	}

}
