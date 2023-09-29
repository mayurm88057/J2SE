package InheritanceExtend;

public class Company{
	int companyID;
	String companyname;
		
public Company(int companyID, String companyname) {
	super();
	this.companyID= companyID;
	this.companyname=companyname;
	
}

@Override
public String toString() {
	return "Company [companyID=" + companyID + ", companyname=" + companyname + ", hashCode()=" + hashCode() + "]";
}
}

	
	