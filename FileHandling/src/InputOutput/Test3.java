package InputOutput;
// creattion of file with the help of the try block 
import java.io.FileOutputStream;

public class Test3 {

	public static void main(String[] args) throws Throwable {
		
		try(FileOutputStream obj = new  FileOutputStream("my2023"))
				{
		
	 obj.write('A');
     obj.write('B');
     obj.write('C');

	}

	}}
