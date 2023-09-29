package methodOverLoading;

public class Demo {
	
	void m() {
		System.out.println("method with no parameter");
	}
    void m(int p) {
    	System.out.println("method with 1 parameter");
    }
    void m(int p,int q) {
    	System.out.println("method with 2 parameter");
    	    }
    void m(int p,int q,int r) {
    	System.out.println("method with 3 parameter");
    }
}


