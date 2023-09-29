package ObjectReturn;
 
public class ObjectReturns {
	
	public static void updateFees(Student s) {
		System.out.println("before increment fees =" +s.getFees());
		/* s.fees=s.fees+10*s.fees/100; */
		s.setFees(s.getFees()+10*s.getFees()/100);
		
		System.out.println("After increment fees =" +s.getFees());
		
	}
 
	public static void main(String[] args) {
   
		
		Student s1 =new Student("hemant",111,2100.0);
		Student s2 =new Student("kirti",101,1500.0);
		Student s3=new Student("bhupendra",111,500.0);
		Student s4=new Student("arun",112,1220.0);
		
		updateFees(s1);
	}

}
