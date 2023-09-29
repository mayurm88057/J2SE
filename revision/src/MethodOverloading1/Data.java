package MethodOverloading1;

public class Data {
	
	int i,j,k;
	
	Data(){
		i=j=k=0;
		
	
	}
	Data(int pi){
      i= pi;
  
}
	Data(int pi, int pj){
		i=pi;
		j=pj;
		
	}
	Data(int pi,int pj,int pk){
		i=pi;
		j=pj;
		k=pk;
	}
	public void displayData() {
		System.out.println("i = " +i+ " j = " + j + " k=" +k);

	 }
	}
