// odd numbers using while loops
package whileloop;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
    int i,n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the Number");
   n=sc.nextInt();
   i=1;
   while(i<n) {
    if(i%2==1)
       System.out.println(i+" ");
       i++;
   
   }
	}
}
