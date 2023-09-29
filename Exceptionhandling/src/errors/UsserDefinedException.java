//custom checked example 
package errors;

class SpeedException extends Exception{
	
}
public class UsserDefinedException {

	public static void main(String[] args) {
		{
			int speed=180;
			SpeedException se =new SpeedException();
			try {
				if(speed>=100)
					throw se;
			}
			catch(SpeedException s) {
				System.out.println("please fasten your set blet ");
			}
		}
	}

}
