package Methodcallandpropogation;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in);)
		{
			System.out.println("in TRW WIth resources");
			throw new RuntimeException();
			
		}catch (RuntimeException e)
		{
			System.out.println("in catch ");
		}
		finally {
			System.out.println("in finally");
		}
	
		}
	}
