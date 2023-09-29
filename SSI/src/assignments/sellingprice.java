package assignments;

import java.util.Scanner;

public class sellingprice {

		public static void main(String[] args) {
			double C, S;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Cost Price");
			C=sc.nextDouble();
			System.out.println("Enter your Selling Price");
			S=sc.nextDouble();

			if (S>C)
			System.out.println("You have Profit "+(S-C)+" is your profit");
			else if (S==C)
			System.out.println("You Dont have loss as wll as profit");
			else if (S<C)
			System.out.println("You have Loss "+(C-S)+" is your Loss");
			else
			System.out.println("You Dont have loss as wll as profit");
			}
			}
	


