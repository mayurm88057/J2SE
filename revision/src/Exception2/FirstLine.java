package Exception2;

public class FirstLine {

	public static void main(String[] args) {
    System.out.println("first line ");
int x;
try {
	x=10/0;
}catch(Exception e) {
	System.out.println("inside the catch block");
	
	
}
finally {
	System.out.println("inside the finnaly block");
	
}
System.out.println("lastline");

	}

}
