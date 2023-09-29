package Interface;

public class ExampleInterface {
	
	interface printable{  
		void print();  
		}  
}
	
	class A6 implements ExampleInterface.printable{  
		public void print(){System.out.println("Hello");}  
	
		public static void main(String args[]){  
		
			A6 obj = new A6();  
		obj.print();  
		 }  
	} 
	

