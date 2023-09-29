package Exceptionhandle;

public class ArrayBoundException {
	public static void main(String[] args) {
		System.out.println("first line");
		
			int x[]={1,2,3};
			try {
				  x[5]=100;
			}catch(Throwable e) {
				
			}
			
		   
		     System.out.println("error");
		     

		 }
	}
	


