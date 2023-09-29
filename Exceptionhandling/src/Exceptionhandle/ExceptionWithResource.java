package Exceptionhandle;

import java.util.Scanner;

public class ExceptionWithResource {
	
	public static void main(String[] args) {
		System.out.println("first line");
		try {
			Scanner sc=new Scanner(System.in);
			
		}
		finally{
			System.out.println("lastline");
		}
	}

}
