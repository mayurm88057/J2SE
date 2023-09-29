package ObjectReturnwithnonstaticmethod;

public class Student {
	String sname;
	int    rollno;
	double fees;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Student(String sname, int rollno, double fees) {
		super();
		this.sname = sname;
		this.rollno = rollno;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + ", fees=" + fees + "]";
	}
	
	

}
