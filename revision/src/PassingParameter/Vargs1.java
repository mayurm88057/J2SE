package PassingParameter;
import javax.annotation.processing.SupportedSourceVersion;


public class Vargs1 {
	
	
	private static void m1(int... k) {

		for(int i:k) {
			System.out.println(i);
		}
		}

	
	public static void main(String[] args) {
		m1(1,2,3);
		System.out.println("=====================");
		m1(1,2,3,4,5,6);
		System.out.println("======================");
	}

} 
	

	

