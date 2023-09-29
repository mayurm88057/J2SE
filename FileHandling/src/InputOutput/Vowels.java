package InputOutput;
import java.io.FileInputStream;
public class Vowels {


		public static void main(String[] args) throws Throwable {
			
			 int countvowels=0;

			FileInputStream obj = new FileInputStream("mydec2022");

			int i;
			do {

				i = obj.read();

				if(i=='a' || i=='e'|| i=='o'||i=='i'||i=='u'||i=='A' || i=='E'|| i=='I'||i=='O'||i=='U')

					countvowels++;
				
			} while (i != -1);
			//This is a wonderful day to start preparations again.
			System.out.println("Number of voswels = "+countvowels);

			obj.close();

		}

	}


