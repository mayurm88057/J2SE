package inherit6;

public class Test {

	public static void main(String[] args) {
      A a=new A();
      B b=new B();
      System.out.println(a.hashCode());
      System.out.println(b.hashCode());
      a=b;
      System.out.println("-------------");
      System.out.println(a.hashCode());
      System.out.println(b.hashCode());
	}

}
