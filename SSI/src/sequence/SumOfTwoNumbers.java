package sequence;
import java.util.Scanner;
public class SumOfTwoNumbers 
{

	public static void main(String[] args) {
		int sum ,n1,n2;
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter any two number");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		sum=n1+n2;
		
		System.out.println("Sum ="+sum);
		}

}
