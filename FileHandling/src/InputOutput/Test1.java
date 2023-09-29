package InputOutput;

import java.io.FileOutputStream;

public class Test1 {

	public static void main(String[] args) throws Throwable {
		FileOutputStream obj = new  FileOutputStream("mydec2022");
     
		
	 obj.write('A');
     obj.write('B');
     obj.write('C');

     obj.close();
	}

}
