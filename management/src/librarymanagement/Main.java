package librarymanagement;

import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	 
	    	//Books obj=null;
	    	Books obj=new Books(null, null);
	    // obj=new Books( bookName, author);
	    	
	        System.out.println("Welcome to Payas Library");

	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("Menu");
	            System.out.println("1. ADD BOOK");
	            System.out.println("2. REMOVE BOOK");
	            System.out.println("3. SEARCH BOOK");
	            System.out.println("4. EXIT");
	            System.out.print("Enter your choice (1/2/3/4): ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume the newline character left in the buffer

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the name of the book to add: ");
	                    String bookName=sc.nextLine();
	                    System.out.print("Enter the name of Author of book to add: ");
	                    String author=sc.nextLine();
	                    // obj=new Books( bookName, author);
	                    System.out.println("Book added : "+bookName + " of Author : " + author );
	                    break;
	                case 2:
	                    if (obj !=null) {
	                        System.out.println("Book removed: " + obj.getBookName());
	                        obj=null;
	                      
	                    } else {
	                        System.out.println("No book to remove.");
	                    }
	                    break;
	                case 3:
	                    if (obj !=null) {
	                        System.out.println("Book found: " + obj.getBookName() +" by "+obj.getAuthor() );
	                    } else {
	                        System.out.println("No book in the library.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting the program.");
	                    sc.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid option. Please select a valid option.");
	                    break;
	            }
	        }
	    }
	}


