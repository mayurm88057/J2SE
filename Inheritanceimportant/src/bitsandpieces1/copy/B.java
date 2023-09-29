package bitsandpieces1.copy;

public class B extends A{
 public int i =500;

public int getI() {
	return i;
}

public void setI(int i) {
	this.i = i;
}
public void dislay() {
	 System.out.println("i of super = " +super.i);
	 System.out.println(" i of sub= " + i);
}
 
}
