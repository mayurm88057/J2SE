package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputWithTry {
	public static void main(String[] agrs) throws Throwable {
		int i;
		try(FileInputStream obj = new FileInputStream("mydec2022")){
	  do {
		  i = obj.read();
		  System.out.print((char)i);
		  
	  }while(i!=-1);
		}
		
		
		}
		

	}
