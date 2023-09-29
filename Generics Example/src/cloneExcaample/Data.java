package cloneExcaample;

 class Data implements Cloneable {
 
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	String name="sk";
  void m1() {
	 System.out.println("Instance method");
 }
 }

