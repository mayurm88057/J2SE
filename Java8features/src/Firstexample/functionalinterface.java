package Firstexample;

// interface with lambda expression a
public class functionalinterface {
	public static void main(String[] args) {

		MyFunctioninterface mf1 = () -> System.out.println("oracle");

		MyFunctioninterface mf2 = () -> System.out.println("mysql");

		MyFunctioninterface mf3 = () -> System.out.println("mongo db");

		mf1.m1();
		mf2.m1();
		mf3.m1();

	}

}
