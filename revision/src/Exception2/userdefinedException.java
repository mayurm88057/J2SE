package Exception2;

class SpeedException extends Exception{
	
public class userdefinedException {
 public static void main(String[] args) {
	int speed =180;
	SpeedException se = new SpeedException();
	try {
		if(speed>=100)
			throw se;
		
	}
	catch(SpeedException s) {
		System.out.println("please tied the seat belt");
		
	}
	
}
	
	
}
}