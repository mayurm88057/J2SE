package LoopLabel1;

public class myloop {

	public static void main(String[] args) {
		int i;
		
		myloop:
		for (i = 1; i < 10; i++)
			System.out.println(i);
		System.out.println("after loop" + i);

	}

}
