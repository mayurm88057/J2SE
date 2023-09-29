package interfaceex;

public class Test {
  public static void main(String [] args) {
	  //Mykitchen mk =new Mykitchen();
	  Mykitchen mk;
	  mk=new PannerButter();
	  mk.tocook();
	  
	  mk=new PalakPanner();
	  mk.tocook();
	  
	  
	  mk=new PannerPakoda();
	  mk.tocook();
  }
}

