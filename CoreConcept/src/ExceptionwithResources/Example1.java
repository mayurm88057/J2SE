package ExceptionwithResources;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		
		try(Scanner sc= new Scanner(System.in);){
		int y=9/0;
		}
	}

}
