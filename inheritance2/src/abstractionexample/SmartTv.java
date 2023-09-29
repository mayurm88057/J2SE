package abstractionexample;

public class SmartTv {
	public void On() {
		System.out.println("the starting the TV");
	start();
	}
	private void start() {
		System.out.println("boot tv");
		System.out.println("start apps");
		System.out.println("Display dASH BOARD ");
	}
public void Off() {
	System.out.println("closing the TV");
	System.out.println("wait while shut down");
     stop();
}  
private void stop() {
	System.out.println("closing all apps");
	System.out.println("release memory");
	System.out.println("Good bye message ");
}
}
