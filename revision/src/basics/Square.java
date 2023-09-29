package basics;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
     int i,n;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the range");
     n=sc.nextInt();
     for(i=1;i<=n;i++)
    	 System.out.println(i*i+" ");
	}

}
