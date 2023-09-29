package Exceptionhandle;

public class passingStringInExcpetion {
	public static void main(String[] args) {
		System.out.println("in main  dancing doll");
		
		String s[]=null;
		try {
			main(s); 	
		}catch(Exception e) {
		System.out.println("inside the main");
	}

}
}