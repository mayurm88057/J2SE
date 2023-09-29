package RandomNumber;

public class RandomExample {
	public static void main(String[] args) {
		
		int x;
		String otp=" ";
		
		for(int i=1;i<=6;i++) {
			
			x=(int)(Math.random()*10);
			otp=otp+x;
		}
		System.out.println( "otp =  " + otp);
		
		
	}

}
