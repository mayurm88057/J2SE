package Revison;

public class TestBank {

	public static void main(String[] args) {
      BankAtm ba= new BankAtm();
      ba.withdawl(100);
      System.out.println("amount after with drawl"+ba.bal);
	  ba.withdawl(1000);
	  System.out.println("amount after withdrawl="+ba.bal);
	}

}
