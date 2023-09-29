package Firstexample;

@FunctionalInterface
public interface MyFunctioninterface {

	public void m1(); // Single abstract method

	static void m2() {

	}

	default void m3() {

	}
}
