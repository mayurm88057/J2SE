package methodexamplesStatic;
public class GrossSalary {

	static double salarycalculation(double bs) {
		double gs=0,ta=0,da=0,hra=0;
		
		ta=0.2*bs;
		da=.9*bs;
		hra=.15*bs;
		gs=ta+da+hra+bs;
		return gs;
		}
	
	public static void main(String[] args) {
   System.out.println(salarycalculation(10000.00));
	}

}
 