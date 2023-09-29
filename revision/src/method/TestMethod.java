package method;

class Data{
	
	void square(int a) {
		System.out.println(a *a);
	}
}

public class TestMethod {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.square(5);

	}

}
