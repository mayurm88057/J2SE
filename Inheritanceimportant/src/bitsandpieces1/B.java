package bitsandpieces1;

public class B extends A{
	private int a = 300;
	
	public int getA(){
		return a;
		
	}
	public void setA(int a){
		this.a= a;
		
	}
	
	@Override
	public String toString() {
		//return "a=" + a + ", b=" + b;
		return "a of B class=" +a + ",a of A = " + super.getA()+ " b of A=" + super.getB();
	}

	{
}

}
