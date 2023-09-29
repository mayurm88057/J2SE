package aftergen;// without explicit type casting 
import java.util.ArrayList;
public class App5<T> {
    T o;
    public static void main(String[] args) {
    App5<Integer>i = new App5<>();
    i.o=100;
    App5<String> s=new App5<>();
    s.o="pune";
    
	}

}
