package MethodOverloading1;

public class TestMethod {

	public static void main(String[] args) {
   Data d1=new Data();
   Data d2=new Data(100);
   Data d3=new Data(11,33);
   Data d4=new Data(222,333,444);
   
   d1.displayData();
   d2.displayData();
   d3.displayData();
   d4.displayData();
	}

}
