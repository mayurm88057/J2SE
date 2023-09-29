package GenricMethod;

public class TestMethod {
	public static<E>void m(E e){
		System.out.println("in gen method = " +e);
	}

	public static void main(String[] args) {
    m("Rutvik");
    m(199);
    m(10.390);
	}

}
