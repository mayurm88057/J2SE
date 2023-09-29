package Genex;
public class ObjectParty {

	public static void main(String[] args) 
			throws ClassNotFoundException,InstantiationException, IllegalAccessException {
    Class cls =Class.forName("Genex.Data"); // loading the file 
	System.out.println(cls);
    
    Data obj=(Data)cls.newInstance();// creation of the object
  System.out.println(obj.name);
  obj.m1();
	}
 
} 