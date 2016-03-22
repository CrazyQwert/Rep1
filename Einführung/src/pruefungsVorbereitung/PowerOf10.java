package pruefungsVorbereitung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerOf10 {

	public static void main(String[] args) {

		int zahl = 367;
		
		System.out.println(nextPowerOf10(zahl));
		
	}
	
	public static int nextPowerOf10(int zahl) {
		
		int ergebnis;
		String laenge = String.valueOf(zahl);
		
		ergebnis = (int) (1 * Math.pow(10, (double)laenge.length()));
		
		return ergebnis;
	}
}
