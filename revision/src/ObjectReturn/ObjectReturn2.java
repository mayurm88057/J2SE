package ObjectReturn;

public class ObjectReturn2 {

	public static Student m2() {

		return new Student("mayur", 121, 1245.00);
	}

	public static void main(String[] args) {

		Student mStudent = m2();

		System.out.println(mStudent);

	}

}
