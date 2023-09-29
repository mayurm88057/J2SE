package Revison; // user defined exception 
class SpeedException extends Exception{
	
}
public class CustomeException {
	public static void main(String[] args)
	{
		int speed=180;
		SpeedException se=new SpeedException();
		try {
			if(speed>=100)
			//if(speed<=100)
				throw se;
		}
		catch(SpeedException s) {
			System.out.println("please put the seat belt");
		 System.out.println("plese slow the the car");
		}
		
	}

}
