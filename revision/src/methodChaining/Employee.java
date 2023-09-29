package methodChaining;

public class Employee {
	String Ename;
	int Eid;
	double Esal;
	
public Employee setEname(String name) {
	Ename=name;
	return this;
}
	public Employee setEid(int id) {
		Eid=id;
		return this;
	}
		
		public Employee setEsal(double sal) {
			Esal=sal;
			return this;
			
		}
		@Override
		public String toString() {
			return "Employee [Ename=" + Ename + ", Eid=" + Eid + ", Esal=" + Esal + "]";
		}
		
		
	}


