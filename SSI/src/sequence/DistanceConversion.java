package sequence;

import java.util.Scanner;

public class DistanceConversion {

	public static void main(String[] args) {
    double km,cm,mm,m;
    Scanner input=new Scanner(System.in);
    System.out.println("input value of distance");
    km=input.nextDouble();
    m=km*1000;
    cm=m*100;
    mm=cm*10;
    System.out.println("value in kilometer ="+km);
    System.out.println("value in meter ="+m);
    System.out.println("value in centimeter ="+cm);
    System.out.println("value in meter="+mm);
	}

}
