package Opertors;

public class oddNumberSum {

	public static int SumOfOddsAndEvens(int n){
			int n1,n2=0,n3;
			while(n!=0)
			{
				n1=n%10;
				if((n1%2)!=0)
					n2+=n1;
				n/=10;
			}
			if(n2%2==0)
				n3=-1;
			else
				n3=1;
			
			return n3;	
		}
		public static void main(String[] args) {
			int n=12346;
			System.out.println(SumOfOddsAndEvens(n));
		}
	}
