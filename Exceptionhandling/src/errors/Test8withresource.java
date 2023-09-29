package errors;

import java.util.Scanner;

public class Test8withresource {

	public static void main(String[] args) {
System.out.println("first line ");
 try{
	 Scanner sc=new Scanner(System.in); 
	}finally{
System.out.println("last line ");
}
}
}
// automatic resource managemnet ARM
// TWR --> Try with resource