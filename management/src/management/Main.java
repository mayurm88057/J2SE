package management;

import java.util.Scanner;

public class Main {
	
 public static void main(String[] args) {
	System.out.println("welcome to libarary ");
	System.out.println("MENU");
	System.out.println("1.Add books ");
	System.out.println("2.Search ");
	System.out.println("3.Remove");
	System.out.println("4.Exit");
	
	Scanner sc =new Scanner(System.in);
	System.out.println("please enter a option");
	int option;
	option =sc.nextInt();
	sc.nextLine();
	Book b =null;
	do
	{
	switch(option)
	{
	case 1: // implemention
		System.out.println("Add books");
	    System.out.println("Enter book name"); 
	    Scanner sc1=new Scanner(System.in);
	    String bookname=sc.nextLine(); 
	    b=new Book(bookname);
	   // Book b =new Book(bookname);
		System.out.println("book added successfully");
		sc1.close();
		
break;
	case 2:
	
		System.out.println("Search");
		System.out.println("Enter the Book name to search");
		Scanner sc2 =new Scanner(System.in);
		String bookname1=sc2.nextLine();
		//Book b1 =new Book(bookname1);
		if(bookname1.equals(b.Bookname()))
		{
			System.out.println("Book Exists");
		}
{
	System.out.println("book exit");
}
	
		
	 break;
	case 3:
		System.out.println("Remove");
		
		break;
	case 4:
	System.exit(0);
		break;
	}
}while (option !=4);
 }
}
