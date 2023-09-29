package errors;

public class Test6 {

	public static void main(String[] args) {
  System.out.println("First line");
  int x;
  try {
  x=10/0;
  }
  finally {
	  System.out.println("inside the finally bock");
  }
System.out.println("LastLine");
}}
