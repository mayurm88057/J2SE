package Passingargs;

public class Test 
{
public static void m1(int a) {
	a=500;
	
}
	public static void main(String[] args) {
  int a =100;
  System.out.println("before method call a = "+a);
  m1(a);
  System.out.println("after method call a= " +a);
	}

}
