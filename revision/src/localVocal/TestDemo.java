package localVocal;

public class TestDemo {
	
	
	public void swap(int a,  int b) {
	int t ;
	t=a;
	a=b;
	b=t;
		
	}
	public static void main(String[] args) {
    int a =100,b=200;
    TestDemo t= new TestDemo();
    System.out.println("before swapping a = " +a+ "b =" + b);
    t.swap(a,b);
    System.out.println("after swapping a= " + a + "b =" +b);
	}

}
