package basics;

import java.util.Scanner;

public class sellingprice {

	public static void main(String[] args) {
     double C,S;
     Scanner sc =new Scanner (System.in);
     System.out.println("enter the cost");
     C=sc.nextDouble();
     System.out.println("enter the selling price");
     S=sc.nextDouble();
     
     if(S>C)
    	 System.out.println("you have profit"+(S-C)+" is your profit");
     else if(S==C)
     System.out.println("you dont have loss as well as porfit");
     else if(S<C)
    	 System.out.println("you have loss " + (C-S) +"is your loss"); 
     else 
    	 System.out.println("you dont have to loss as well as profit");
    	 }

}
