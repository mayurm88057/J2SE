package ObjectReturn;


public class ObjectsReturn2 {

	public static Student m1() {

		Student s1 = new Student("Bhupendra", 111, 1200.0);

		return s1;
 	}

	public static void main(String[] args) {
		
		Student mStudent = m1();
		
		System.out.println(mStudent);

	}

}
