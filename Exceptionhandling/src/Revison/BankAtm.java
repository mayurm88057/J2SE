package Revison;

public class BankAtm {
	int bal=1000;
	public void withdawl(int amt) {
		if(amt<bal)
			bal=bal-amt;
		else 
			System.out.println("Insufficient funds");
	}

}
