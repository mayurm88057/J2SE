package Exception;

public class ArrayOutBoundException {

	public static void main(String[] args) {
		System.out.println("last line");
		int x[]= {1,2,3};
		x[5]=100;
		System.out.println("lastline");
	}	}