package InheritanceExtend;

public class Department extends Company {
	String deptname;
	int deptEmpcount;
	
	public Department(int companyID, String companyname, String deptname, int deptEmpcount) {
		super(companyID, companyname);
		this.deptname = deptname;
		this.deptEmpcount = deptEmpcount;
	}

	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", deptEmpcount=" + deptEmpcount + ", hashCode()=" + hashCode()
				+ "]";
	}

	

}
