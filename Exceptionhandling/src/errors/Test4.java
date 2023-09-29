package errors;

public class Test4 {

	public static void main(String[] args) {
  System.out.println("First line");
  try {
	  int a[]=new int[10000];
  }
catch (Error e) {
	System.out.println(e);
}
  System.out.println("Last line");
	}

}
