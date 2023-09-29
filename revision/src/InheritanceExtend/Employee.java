package InheritanceExtend;

public class Employee extends Department{
	int empID;
	String empName;
	double empSalary;
	
	public Employee(int companyID, String companyname, String deptname, int deptEmpcount, int empID, String empName,
			double empSalary) {
		super(companyID, companyname, deptname, deptEmpcount);
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
