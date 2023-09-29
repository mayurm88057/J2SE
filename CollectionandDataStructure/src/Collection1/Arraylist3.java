package Collection1;

import java.util.ArrayList;

public class Arraylist3 {
	
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList();
	a1.add(111);
	a1.add(222);
	a1.add(333);
	a1.add(444);
	
	ArrayList<Integer> a2=new ArrayList();
	a2.add(11);
	a2.add(33);
	a2.add(44);
	a2.add(99);
	
	System.out.println(a1);
	System.out.println(a2);
	
	ArrayList<Integer> a3=new ArrayList<>(a2);
	a3.addAll(a1);
	System.out.println(a3);
	System.out.println("size =" +a1.size());
	System.out.println("size = " +a2.size());
	System.out.println("size = " + a3.size());
	
	
}
}
