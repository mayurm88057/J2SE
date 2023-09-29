
public class Static2 {
	public static void main(String[] args) {
		hello();
		
		
	}
	private static void hello(){
		hello1();
	}
	private static void hello1() {
		System.out.println("hello from hello2 ");
	}

}
