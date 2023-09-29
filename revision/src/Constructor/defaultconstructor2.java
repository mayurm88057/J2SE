package Constructor;

class person1{
	public person1() {
		System.out.println("this is with no parameter");
	}}
		
class Student1{
		public Student1(int a,int b){
	    int a1=a;
	     int b1=b;
System.out.println("this is student constructor");			
		
		}
	}
	public class defaultconstructor2{
			
		
	public static void main(String[] args) {
           person1 P1=new person1();
           Student1 s2=new Student1(10,20);
           System.out.println(s2);
	}

	}
