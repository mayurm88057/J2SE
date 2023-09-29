package Methodcallandpropogation;


class abc{
	public static void m1() {
		System.out.println("in static ");
		
	}
	public void m2() {
		System.out.println("in non static method ");
	}
	
}
public class nullPointer {
	public static void main(String[] args) {
		abc bc=null;
		//abc.m2(); /// 
		abc.m1(); 
		
	}

}
