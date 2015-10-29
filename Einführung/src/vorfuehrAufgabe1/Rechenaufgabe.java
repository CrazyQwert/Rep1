package vorfuehrAufgabe1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rechenaufgabe {
	public static void main(String[] args)
	throws java.io.IOException, InterruptedException
	{
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		String eingabe;
		int zahl1;
		int zahl2;
		int auswahl;
		int ergebnis;
		String methode;
		
		
		//Init Output
		System.out.println("initialisiere Rechenprogramm");
		Thread.sleep(2000);	//gives the idea of loading something
		System.out.println("bitte warten ...");
		Thread.sleep(4000);
		System.out.println("laden abgeschlossen");
		
		
		System.out.println();
		
		System.out.println("Bitte wählen sie Ihre Rechenmethode: \n 1. Addieren \n 2. Subtrahieren \n 3. Mulitplizieren \n 4. Dividieren");
		
		System.out.println("Auswahl: ");
		
		//reads line entered by User and saves it
		eingabe = tastatur.readLine();
		// converts entered string to an integer and saves it
		auswahl = Integer.parseInt(eingabe);
		
		if( auswahl == 1 )
		{
			methode = "Addieren";
		} else if( auswahl == 2 ){
			methode = "Subtrahieren";			
		} else if( auswahl == 3 ) {
			methode = "Multiplizieren";
		} else {
			methode = "Dividieren";
		}
		
		System.out.println("Sie haben " + methode + " gewählt!");
		
		Thread.sleep(1000);
		
		System.out.print("Bitte geben Sie die erste Zahl ein: ");
		eingabe = tastatur.readLine();
		// converts entered string to an integer and saves it 
		zahl1 = Integer.parseInt(eingabe);
		// same for second entry
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		eingabe = tastatur.readLine();
		zahl2 = Integer.parseInt(eingabe);
		
		// compute result
		if( auswahl == 1 )
		{
			ergebnis = zahl1 + zahl2;
		} else if( auswahl == 2 ){
			ergebnis = zahl1 - zahl2;			
		} else if( auswahl == 3 ) {
			System.out.print("Geben Sie noch eine dritte Zahl ein: ");
			eingabe = tastatur.readLine();
			// converts entered string to an integer and saves it 
			int zahl3 = Integer.parseInt(eingabe);
			
			ergebnis = zahl1 * zahl2 * zahl3;
		} else {
			ergebnis = zahl1 / zahl2;
		}


		System.out.println("Das Ergebnis betraegt: " + ergebnis);
		
	}
	
}

