package methodobject1;

public class Data {
	public int x;
	public int y;
	
	public Data(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	void m1() {
		System.out.println(this);
	}
	void display() {
		System.out.println(x+  " " +y);
		
}

}
