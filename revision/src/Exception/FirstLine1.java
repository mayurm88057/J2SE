package Exception;

public class FirstLine1
{

	public static void main(String[] args) {
    System.out.println("first line");
    int x;
    try {
    	x=10/0;
    	
    }
    catch(Exception e){
    	System.out.println("inside the block");
    }
    finally {
    	System.out.println("inside the finaly block");
    	}
    System.out.println("lastline");
	}
}