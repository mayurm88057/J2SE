package Constructor;

 class CopyConstructor1{
	int rollno;
	String name;
	String address;
	
	// default constructor
	public  CopyConstructor1() {
		System.out.println("this is default constructr");
	}
	//paratermised constructor

	public CopyConstructor1(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}}
	public class CopyConstructor{
	public static void main(String[] args) {
		CopyConstructor1 c2=new CopyConstructor1();
		CopyConstructor1 c1=new CopyConstructor1(1,"mau","pune00");
		
		System.out.println(c1);
		System.out.println(c2);
	}
	
}


