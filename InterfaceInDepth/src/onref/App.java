package onref;

public class App {

	public static void main(String[] args) {
		MyDatabase1 md;
		// this is example of upcasting
		md = new oracle();
		md.connect();

		md = new mongodb();

		md.connect();

		md = new sql();
		md.connect();

	}

}
