package genExample;

public class ClassInfo {

	public static void main(String[] args) {
   Object o =new Object();
   System.out.println(o.getClass().getName());;
Class c=o.getClass();
// class<? extends Object> c1= o.getClass();
// class<? extends Object> c= o.getClass();
System.out.println(c);
	}

}
