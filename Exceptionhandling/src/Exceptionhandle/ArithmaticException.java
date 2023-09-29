package Exceptionhandle;

public class ArithmaticException {

	public static void main(String[] args) {
 
		try {
		int a =50/0;
		}catch(Throwable e) {
			
			System.out.println("iside main");
		}
	}

}
