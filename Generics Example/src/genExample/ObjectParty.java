package genExample;

public class ObjectParty {

	public static void main(String[] args) {
    Class cls = Class.forName("gen.Data");
    Data obj=(Data) cls.newInstance();
    // print and display 
    System.out.println(obj.name);
    obj.m1();
	}

}
