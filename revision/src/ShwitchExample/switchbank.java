package ShwitchExample;

public class switchbank {

	public static void main(String[] args) {
		String i = "kotak";

		switch (i) {
		case "icici":
			System.out.println("case 1");
			break;
		case "pnb":
			System.out.println("case 2");
			break;
		case "kotak":

			System.out.println("case 3 ");
			break;
		case "sbi":
			System.out.println(" case 4");
			break;
		default:
			System.out.println("in default Case ");
		}
		System.out.println("out of the switch ");
	}

}
