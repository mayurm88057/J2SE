package Revison;


class IndicatorException extends RuntimeException{ 

public class Indicator throw Exception {
	public static void main(String [] args)
	{
		boolean indi=false;
		indi=true;
		try {
		if(indi==true)
			throw new IndicatorException();
		}
		catch(IndicatorException ie) {
			System.out.println("your indicator are on");
		}
	}
}

}
