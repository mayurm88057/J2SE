package Exception1;

public class Exceptionex3 {
  public static void main(String[] args) {
	
	  try {
		  int y=9/0;
		  int x[]= {};
		  x[2]=100;
		  
		  
		  
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
