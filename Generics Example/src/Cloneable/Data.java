package Cloneable;
class Data implements Cloneable
 {
	
		@Override
	protected Object clone() throws CloneNotSupportedException {
 		return super.clone();
	}
		String name="sk";
		void m1() {
			System.out.println("instancee Method ");
		}
	}
