 package basics;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the year:-");
		a =sc.nextInt();
		if(a % 4==0 || a % 400 ==0) {
			System.out.println(a+"the year is leap ");
		} else {
			System.out.println(a+"the year is not leap year");
		}
  
	}

}
