package genExample;

public class TestRtt {

	public static void main(String[] args) {
   Rtt<Integer> r1=new Rtt<Integer>(100);
   Rtt<String>  r2=new Rtt<String>("pune");
   Rtt<double> r3=new Rtt<double>(11.0);
	
   System.out.println(r1.getX());
		   System.out.println(r2.getX());
		   System.out.println(r3.getX());
	}

}
