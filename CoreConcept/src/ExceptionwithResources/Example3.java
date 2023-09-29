package ExceptionwithResources;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

// create self automatic resource management 
class ArmMyclass1  implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
class ArmMyclass2 implements Closeable{

		@Override
		public void close() throws IOException {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
public class Example3 {
	public static void main(String[] args) throws Exception {
	
	try (ArmMyclass1 amc= new ArmMyclass1();){
	}
//	try(ArmMyclass2 ac=new ArmMyclass2 ();){
		
	}
	}
	
	