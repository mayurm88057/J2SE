package PassingParameter;

public class CallByvalue {

	static void m1(int a){ 
		System.out.println("a="+a);
	}
	
	
	public static void main(String[] args) {
    int a=100,b=200,c=300;
   // m1(500); passing the constant
    m1(b); 
    
	}

}
