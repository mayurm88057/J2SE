package errors;

public class Test1 {

	public static void main(String[] args) {
  System.out.println("First line");
  int x;
  try {
  x=10/0;
  }
  catch(Exception e) {
  System.out.println("Inside catch block");
  }
  finally {
	  System.out.println("inside the finally bock");
  }
System.out.println("LastLine");
}}
