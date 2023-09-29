package Exception1;

public class Exceptionex2 {
  public static void main(String[] args) {
	
	  try {
		  int y=9/0;
		  int x[]= {};
		  x[2]=100;
		  
		  
		  
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("in case 1" +e);
		  
		  
	  }catch(ArithmeticException e){
		  System.out.println("in case 2"+ e);
		  
	  }
	  catch(Exception e){
		 System.out.println("in case 4 "+ e);
		  
	  }
	 catch(Throwable t) {
		 System.out.println("in case 3 ");
	 }
		 
	 // default handler if the child can't hanlde it will go to the parent and if the parent can't handle it goes to the default handler
}
}
