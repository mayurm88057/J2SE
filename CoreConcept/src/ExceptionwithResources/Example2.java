package ExceptionwithResources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (Scanner sc = new Scanner(System.in);
				FileInputStream fis = new FileInputStream("empsal");
				FileOutputStream fos = new FileOutputStream("EmpInsure");
				FileReader fr = new FileReader("empdata");) 
		{

		}
		new FileInputStream(" EmpSal");
		new FileOutputStream("EmpInsure");
		new FileReader("empdata");
	}

}