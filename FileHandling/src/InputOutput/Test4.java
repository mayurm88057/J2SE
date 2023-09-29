package InputOutput;

import java.io.FileOutputStream;

public class Test4 {

	public static void main(String[] args) throws Throwable {
	FileOutputStream obj = new  FileOutputStream("f:/mm/dd/yy/mydec");
		
	 obj.write('P');
     obj.write('O');
     obj.write('J');

     obj.close();
	}

}
