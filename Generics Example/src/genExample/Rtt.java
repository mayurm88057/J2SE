package genExample;

public class Rtt<T> {// generics class decleration
	T x;// generics 
	public Rtt(T p)// generics paramete
	{
		System.out.println(p);
x=p;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	

}
