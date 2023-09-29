package Exceptionhandle;

public class NullPointer2solution {

	public static void main(String[] args) {
    String s=null;
    
    try {
    	s.toUpperCase();
    }catch(Throwable t) {
    	System.out.println("inside catch");
    }
    System.out.println("end of main ");
    
   
    
    
	}

}
