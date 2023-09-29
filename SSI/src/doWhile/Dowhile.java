package doWhile;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
    int i,n;
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range");
    n=sc.nextInt();
    i=1;
    do {
       	System.out.println(i+" ");
       	i++;
       	}
    while(i<=n);
    }
} 