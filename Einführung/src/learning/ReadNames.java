package learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadNames {
	
	public static void main(String[] args) throws java.io.IOException {
		
		//Initialisierung
		BufferedReader tastatur = new BufferedReader( new InputStreamReader(System.in) );
		int n = 0;
		
		//Deklarierung
		String[] namensListe;
		String kuerzester;
		String laengster;
		
		//Eingabe-Vorgang
		System.out.print("Bitte geben Sie die Anzahl an geplanten Eingaben an: ");
		n = Integer.parseInt(tastatur.readLine());
		
		//Spacer
		System.out.println();
		
		namensListe = new String[n];
		
		//Namensabfrage
		System.out.println("Geben Sie jetzt ihre gewünschten Namen ein:");
		
		for( int i = 0; i < n; i++ ) {
			System.out.print( "Name " + (i + 1) + ": " );
			namensListe[i] = tastatur.readLine();
		}
		
		
		//kürzesten Namen finden
		kuerzester = namensListe[0];
		for( int i = 0; i < namensListe.length; i++ ) {
			if( kuerzester.length() > namensListe[i].length() ) {
				kuerzester = namensListe[i];
			}
		}
		
		//längsten Namen finden
		laengster = namensListe[0];
		for( int i = 0; i < namensListe.length; i++ ) {
			if( laengster.length() < namensListe[i].length() ) {
				laengster = namensListe[i];
			}
		}
		
		//Ausgabe
		System.out.println("Der kuerzeste Name ist " + kuerzester + " mit " + kuerzester.length() + " Zeichen.");
		System.out.println("Der laengste Name ist " + laengster + " mit " + laengster.length() + " Zeichen.");
		
	}

}
