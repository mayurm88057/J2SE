package LoopLabel1;

public class continueloop {

	public static void main(String[] args) {
		int i;
		
		myloop:
		for (i = 1; i < 100; i++) {
			if(i==15)
				continue myloop;
				
			System.out.print(i+ " ");
		}
		System.out.println("out of the loops"+ i);

	}

}
