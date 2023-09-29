// WAP to calculate gross salary of an employee
// where basic salary is the input
// write a methods for that 
// allowences are as follows
// ta is 20% of the basic sal
// da is 90% of BS
// HRA is 15% of BS
// gs=bs+ta+da+hra

package methodexamplesStatic;

public class Methodexample2 {

	static double salarycalculations(double bs) {
		double gs = 0, ta = 0, da = 0, hra = 0;
		ta = 0.2 * bs;
		da = .9 * bs;
		hra = .15 * bs;

		gs = ta + da + hra + bs;
		return gs;
	}

	public static void main(String[] args) {
		System.out.println(salarycalculations(10000.0));

	}

}
