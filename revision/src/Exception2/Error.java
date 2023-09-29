package Exception2;

public class Error {

	public static void main(String[] args) 
	{
		System.out.println("first line ");
		try {
			int a[]=new int[1000];
			
		}catch(Throwable e) {
			System.out.println("error hanled")
			;
		}
		System.out.println("last line");
	}

}
