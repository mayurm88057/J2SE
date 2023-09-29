// static control and intait control flow

import java.util.Scanner;
public class Static3 {


	    //instace block
	    static
	    {
	        System.out.println("in Static block");
	    }
	    {
	        System.out.println("in Instance block");
	    }
	    int  a;
	    int b;
	    String name;
	    Static3()
	    {
	        System.out.println("in Instance constructor");
	    }
	    public static void main(String[] args) {
	    	Static3 m= new Static3();
	        System.out.println("hello from main");
	    }
	}

