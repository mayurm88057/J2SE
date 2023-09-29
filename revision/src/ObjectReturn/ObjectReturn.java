package ObjectReturn;

public class ObjectReturn {

	public static Student m1(Student s) {

		s.setSname("Mr." + s.getSname());

		return s;
	}

	public static Student m2(Student s) {

		s.setRoll(21 + s.getRoll());
		return s;

	}
	 
	public static Student m3(Student s) {
		s.setFees(130.3 + s.getFees());
		return s;
		
	}

	public static void main(String[] args) {

		Student s1 = new Student("mayur", 101, 1400.0);

		m1(s1);
		System.out.println(s1.getSname());

		m2(s1);
		System.out.println(s1.getRoll());

		 m3(s1);
		System.out.println(s1.getFees());
	}

}
