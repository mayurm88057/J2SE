package SingletonDesignPattern;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class Samosa {
	 
	private  static Samosa samosa;
	
	// constructor
	private Samosa() { // constructor private 
		if(samosa != null) {
			throw new RuntimeException(message:"you are trying to break a singleton pattern");
		}
	}
public  synchronized static Samosa getSomosa()
{ // lazy way to create a single object 
	
	// object of the class 
	if(samosa == null){
		samosa = new Samosa();
	 	
		
	}
	return samosa;
	 
	
}
}
