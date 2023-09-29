package whileloop;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
    int i=1 ,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    n=sc.nextInt(); 
    while(i<=n)
    	System.out.println(i+" ");
    i++;
    }

}
