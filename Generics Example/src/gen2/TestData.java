package gen2;

public class TestData {

	public static void main(String[] args) {
		Data<Integer, String> d1 = new Data<Integer, String>(111, "mayur");
		System.out.println(d1.getK());
		System.out.println(d1.getV());
		Data<String,Integer> d2=new Data<String,Integer>("pune",324);
		System.out.println(d2.getK());
        System.out.println(d2.getV());
	}

}
