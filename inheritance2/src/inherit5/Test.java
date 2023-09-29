package inherit5;

public class Test {

	public static void main(String[] args) {
     A a= new B ();
     a.m1();
     ((B) a).m2();// down casting
     }}
