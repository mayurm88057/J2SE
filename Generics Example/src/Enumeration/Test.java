// Enumeration example with value and values 
package Enumeration;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
    //Days d= Days.fri;
    Months[] m=Months.values();
   for(Months x:m)
    System.out.println(x );
   Months m1=null;
   try {
      m1= Months.valueOf("June");
   }
   catch(Exception e) {
	   System.out.println("Invalid Month");
   }
   System.out.println(m1);
 	}

}
 