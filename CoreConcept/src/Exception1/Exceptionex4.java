package Exception1;

public class Exceptionex4 {
// default handler 	
  public static void main(String[] args) {
	
	  try {
		  throw new Error();// explicit throw the exception 
		 
		  
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("in case 1" +e);
		  
		  
	  }catch(ArithmeticException e){
		  System.out.println("in case 2"+ e);
		  
	  }catch(Exception e) {
		  System.out.println("in case 3 "+ e);
	  }
	  //default handler (JVM)
}
}
