package BitsandPiece;

public class LocalVariable {

	public static void main(String[] args) {
     int a=10;
     {
    	 int x=100;
    	 System.out.println("x = "+x);
    	 System.out.println("a ="+a );
    	 x++;
     }
	}

}
