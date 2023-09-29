package ThisExample;

public class Employee {
	
	String ename;
	int eid;
	double esal;

	public Employee setName(String name ) {
		ename=name;
		return this;
			
	}
	public Employee setEid(int id) {
		eid=id;
		return this;
		
	}
	
	public Employee setEsal(double sal){
		esal=sal;
		return this;
		
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esal=" + esal + "]";
	}
	
	}


