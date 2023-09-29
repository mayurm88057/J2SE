package Exceptionhandle;

public class outofmemory2solution {
	public static void main(String[] args) {
		
		try {
			int a[]=new int[1000000000*10];
		}catch(Error e) {
			System.out.println("it should be its appriooriate subclass");
			
		}
		
	}

}
