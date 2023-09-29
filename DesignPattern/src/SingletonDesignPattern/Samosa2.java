package SingletonDesignPattern;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class Samosa2 {
	 
	private  static Samosa2 samosa;
	
	// constructor
	private Samosa2() { // constructor private 
		
	}
public  static Samosa2 getSomosa(){ // lazy way to create a single object 
	
	// object of the class 
	if(samosa == null){
		
		synchronized(Samosa2.class){
			if(samosa == null) {
				samosa = new Samosa2(); 
			}
		}
		
	 	
		
	}
	return samosa;
	 
	
}
}
