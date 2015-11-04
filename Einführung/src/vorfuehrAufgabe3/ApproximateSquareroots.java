package vorfuehrAufgabe3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ApproximateSquareroots {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String eingabe;

		System.out.println("Wurzelziehen durch geschicktes Raten");
		System.out.println();
		double a; // Eingegebene Zahl, woraus wir Wurzel ziehen wollen

		System.out.print("Gib positive Zahl: ");
		eingabe = tempinput.readLine();
		a = Double.parseDouble(eingabe);

		double square = a;
		double lower = 0; //
		double upper = a;
		double root = ( upper + lower ) / 2;//
		double delta = root * root - square;
		int i = 1;
		while ( Math.abs(delta) > 0.001 ) {

			root = (upper + lower) / 2; // neue root-Wert
			delta = root * root - square;
			if (delta > 0) {
				upper = root;
			} else if (delta < 0) {
				lower = root;
			} else {
				System.out.println("Die Wurzel von " + a + " ist " + root);
			}
			System.out.println("Durchlauf " + i + " : root= " 
					+ root
					+ " 	delta= " + delta + " 	lower= " 
					+ lower + " 		upper= "
					+ upper);
			i++;
		}
		System.out.println("Die Wurzel von " + a + " ist " + root);
	}

}
