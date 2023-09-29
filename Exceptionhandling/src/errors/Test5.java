package errors;

public class Test5 {

	public static void main(String[] args) {
  System.out.println("First line");
  int x;
  try {
  x=10/0;
  }
  catch(Exception e) {
  System.out.println("Inside catch block");
	}
System.out.println("LastLine");
}}
