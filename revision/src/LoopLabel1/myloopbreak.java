package LoopLabel1;

public class myloopbreak {

	public static void main(String[] args) {
		int i;
		
		
		outer:
		for (i = 1; i < 100; i++) {
			if(i==15)
				break outer;
			System.out.println(i);
		}
		System.out.println("out of the loops"+ i);

	}

}
