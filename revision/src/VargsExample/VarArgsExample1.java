package VargsExample;

public class VarArgsExample1 {
	

		public static void m1(int... k) {

			for (int i : k) {
				System.out.println(i);
			}

		}

	public static void main(String[] args) {

			m1(1, 2, 3);
			System.out.println("=====================");
			m1(1, 2, 3, 4, 5, 6);
			System.out.println("=====================");
			m1(11, 22, 33, 44);
			System.out.println("=====================");

		}

	}


