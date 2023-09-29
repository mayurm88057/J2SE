package localVocal;

public class LocalVariable {
	

	public static void main(String[] args) {
    
		int x =200;
		{
			int y =500;
			System.out.println("inside the main block x=" +x);
	        System.out.println("inside the  loocal block y=" +y);	
	      
	        x=1000;
	        y=2000;
		}
		System.out.println("outside the block x=" +x);
		//System.out.println("outside the block y =" +y);
		
	
	}

} 
