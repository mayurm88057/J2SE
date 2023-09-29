package whileloop;

import java.util.Scanner;

public class Even1 {

	public static void main(String[] args) {
		int i;
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		i = 1;
		while (i<= n) {
			if(i%2==0) 
				System.out.println(i + " ");
			
				i++;
		}	
	}
}
