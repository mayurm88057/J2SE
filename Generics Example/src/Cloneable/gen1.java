package Cloneable;

public class gen1 {

	public static void main(String[] args) throws CloneNotSupportedException {
    Data d1= new Data();
    Data d2=(Data)d1.clone(); // object cloning 
    d2.m1();
    System.out.println(d2.name);
    System.out.println(d1.hashCode());
    System.out.println(d2.hashCode());
	}

}
