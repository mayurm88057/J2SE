package OuterInner;

import OuterInner.outer.Inner;

public class Example {
	public static void main(String[] args) {
		 
		Outer.inner objIn =new outer().new Inner();
		
		
		//outer.Inner objIn = objOut.new Inner();
		
		objIn.m2();

	}

}
