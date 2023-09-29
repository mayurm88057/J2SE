package InputOutput;

import java.io.FileInputStream;

public class Test2 {

	public static void main(String[] args) throws Throwable {
   FileInputStream obj = new FileInputStream("mydec2022");
   int i;
   do {
	   i=obj.read();
	   System.out.println((char)i);
   
   }while(i!=-1);
   obj.close(); 
	}

}
