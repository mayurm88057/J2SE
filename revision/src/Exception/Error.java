package Exception;

public class Error {

	public static void main(String[] args) {
System.out.println("first line");
try {
    int a[]=new int[1000];
}
catch(Throwable e){
	System.out.println("Error handled");
}
System.out.println("lastline");

}}