 package interface4implements;

public interface i1 {
static void m1() {
	System.out.println("static method m2 of an interface ");
		
	}
	default void m2() {
		System.out.println("in default m2 of an interface");
		m3();
	}
	private void m3() {
System.out.println("in the private methiod m3 of an interface ");

	}
	void m4();
}
 