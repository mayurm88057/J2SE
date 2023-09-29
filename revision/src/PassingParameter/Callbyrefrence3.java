package PassingParameter;

public class Callbyrefrence3 {
	
public static void m1(Object obj) {		
	}


public static void main(String[] args) {
	Employee e1 = new Employee();
	m1(e1);
  m1 (new Student());//annoyous object
  m1(new DataBaseConnection());
}




}
