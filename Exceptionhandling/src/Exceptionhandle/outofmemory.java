package Exceptionhandle;

public class outofmemory {
	public static void main(String[] args) {
		
		try {
		int a[]=new int[1000000000*10];//
	}catch(Error e) {
		System.out.println("error handled");
	}
		
	}

}
