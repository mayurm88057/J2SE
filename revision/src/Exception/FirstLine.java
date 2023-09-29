package Exception;

public class FirstLine {

	public static void main(String[] args) {
   System.out.println("First Line");
   int x;
   try {
	   x=10/0;
	   }
   catch(Exception e) {
	   System.out.println("inside the catch block");
   }
finally {
	System.out.println("inside the finally block");
}
   System.out.println("lastline");
}
}