package moreexamples;

public class Test2 {

	public static void main(String[] args) {
    try {
    throw new NullPointerException();
    }
     catch (ArithmeticException e ) {
    	System.out.println("In AE");
    }
    catch(NullPointerException e) {
    System.out.println("in NPe");
    {
    } }
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("In AIOBE");
    }
    catch(Exception e) {
    	System.out.println("IN Exception");
    }
	}
}
