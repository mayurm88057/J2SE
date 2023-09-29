package basics;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
     int i,n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the range");
     n=sc.nextInt();
     i=1;
     do{
    System.out.println(i+" ");    	 
     i++;
     }
     while(i<=n);
     
	}

}
