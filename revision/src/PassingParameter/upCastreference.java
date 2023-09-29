package PassingParameter;

public class upCastreference {
	
public static void m1(Employee employee) {		
	}

public static void m2(Student student) {
	
}

private static void m3(DataBaseConnection dataBaseConnection) {
	
}
public static void main(String[] args) {
	Employee e1 = new Employee();
	m1(e1);
  m2 (new Student());//annoyous object
  m3(new DataBaseConnection());
}




}
