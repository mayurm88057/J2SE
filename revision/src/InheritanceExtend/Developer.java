package InheritanceExtend;

public class Developer extends Employee {
	String Project;
	String Devtype;
	
	
	public Developer(int companyID, String companyname, String deptname, int deptEmpcount, int empID, String empName,
			double empSalary, String project, String devtype) {
		super(companyID, companyname, deptname, deptEmpcount, empID, empName, empSalary);
		Project = project;
		Devtype = devtype;
	}


	@Override
	public String toString() {
		return "Developer [Project=" + Project + ", Devtype=" + Devtype + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	

}
