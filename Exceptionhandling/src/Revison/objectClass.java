package Revison;

public class objectClass {
	public static void main(String[] args) {
		try {
			Object oe = new Object();
		} catch (Throwable oe) {

			throw oe;

		}
		System.out.println("error handlled");
	}
}

//no exception of type object can be thrown;
// an exception type must be a subclass of throwable