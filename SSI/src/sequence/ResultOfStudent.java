package sequence;

import java.util.Scanner;

public class ResultOfStudent {

	public static void main(String[] args) {
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
System.out.println("enter your subject marks(A) marks=");
b=sc.nextInt();

if(45<=a && 45<b)
	System.out.println("pass");
else if (45>=b && 45<=a)
	System.out.println("reappear exam of B");
else 
	System.out.println("fail");

	}


}
