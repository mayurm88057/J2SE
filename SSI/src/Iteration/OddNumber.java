package Iteration;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
        int i,n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : - ");
		
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
			
			System.out.print(2*i-1+" ");
	}

}
