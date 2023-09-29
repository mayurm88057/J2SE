package methodexamplesStatic;

import java.util.Scanner;

public class Even {

	static void mayur() {
	       int i,n;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range : - ");
			
			n=sc.nextInt();
			
			for(i=1;i<=n;i++)
				
				System.out.print(2*i+" ");
		}

	
		public static void main(String[] args) {
mayur();
	}

}
