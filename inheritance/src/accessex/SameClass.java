package accessex;

public class SameClass {
	
	int a=100;
	public int b=200;
	private int c=300;
	protected int d=500;
	
   public static void main(String[] args) {
	   SameClass sc =new SameClass();
	   System.out.println(sc.a);
	   System.out.println(sc.b);
	   System.out.println(sc.c);
	   System.out.println(sc.d);
   }

}
