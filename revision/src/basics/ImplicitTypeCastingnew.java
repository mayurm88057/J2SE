package basics;

public class ImplicitTypeCastingnew {

	public static void main(String[] args) {
 int i;
 byte b=100;
 i=b;
 b=(byte)i;
 System.out.println("i =" +i);
 System.out.println(b);
	}
}