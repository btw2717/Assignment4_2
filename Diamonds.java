/**
 * The Diamonds class prints the first 100 odd and even whole numbers and then prints a diamond shape of asterisks, all using loops.
 * This class utilizes the main() method to carry out the arguments or statements.
 *
 * @author sapper
 * email: email
 * @version 1.0
 * Created 7NOV2017
 */

public class Diamonds {

	/**
	 * The main() method is the entry point for the application and executes the loop and print statements.
	 *
	 * @param args arguments passed from the command line
	 */

	public static void main(String[] args) {
		//declaring the arrays and counters for the odds and evens
		int[] odds = new int[100];//101 indices
		int[] evens = new int[101];//102 indices
		int i = 0;
		int n = 1;//to exclude zero on the evens formula

		System.out.println("ODDS    COUNT");//header
		for(i=0; i<100; i++) {
			odds[i] = 2 * i + 1;//index i = an odd number
			//spaces to fit under header
			System.out.println(odds[i]+"        "+i);
		}
		//spaces between outputs
		System.out.println();
		System.out.println();

		System.out.println("EVENS   COUNT");
		do {
			evens[n] = 2 * n;//index n = next even number
			System.out.println(evens[n]+"        "+n);
			n++;
		} while (n<=100);//<= because n starts at 1 instead of zero

		System.out.println();
		System.out.println();
		//System.out.println();
		//System.out.println();

		int z = 1;
		char twinkle = '*';
	
		//25 total spaces of possibility + space 0
		while (z<26) {
			switch (z) {
				//first row
				case 3:
				//second row
				case 7:
				case 8:
				case 9:
				//third row
				case 11:
				case 12:
				case 13:
				case 14:
				case 15:
				//fourth row
				case 17:
				case 18:
				case 19:
				//fifth row
				case 23:
					System.out.print(twinkle);
					break;
				//everything not a star is..
				default:
					System.out.print(" ");

			}
			if(z % 5 == 0) {
				System.out.println();
				System.out.println();
			}
			z++;
		}
	}
}
