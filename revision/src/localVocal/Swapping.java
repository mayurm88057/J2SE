package localVocal;

public class Swapping {
	
	public void swap(int a ,int b) {
		int t;
		
		t=a;
		a=b;
		b=t;
	}
	

	public static void main(String[] args) {
		TestDemo t =new TestDemo();
		int a =100,b=200;
		System.out.println("befor swap" +a+"b= " + b);
		t.swap(a,b);
		System.out.println("after swap" +a+ " b =" + b);
    
	}

}
