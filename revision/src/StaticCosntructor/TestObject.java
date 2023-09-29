package StaticCosntructor;

public class TestObject {

	public static void main(String[] args) {
    
		Data d1 =new Data();
		Data d2 =new Data();
		Data d3 =new Data();
		
		d1.setData(11, 22);
		d2.setData(444,555);
		d3.setData(1000, 2000);
		
		d1.displayData();
		d2.displayData();
		d3.displayData();
	}

}
