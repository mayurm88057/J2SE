package methodObject;

public class test1 {

	public static void main(String[] args) {
		Data d1 =new Data();
		Data d2=d1;
		d1.x=100;
		d1.y=200;
		System.out.println(d2.x);
		System.out.println(d2.y);
		System.out.println("===================");
		d2.x=500;
		d2.y=700;
		System.out.println(d1.x);
     System.out.println(d1.y);
	}

}
