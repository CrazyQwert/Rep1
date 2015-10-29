package vorfuehrAufgabe1;
//
//Zahlraten.java
//Programexample for guessing numbers between 1 and 100
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class ZahlRaten
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		BufferedReader tastatur = new BufferedReader(new InputStreamReader(System.in));
		Random urne = new Random();	//generate random-random-number-urn
		
		int zahl;	//random number one has thought of
		String eingabe;	//temporary storage for keyboard inputs
		int x;	//random number user has thought of and entered
		boolean gefunden;	//shows, that the number has been guessed correctly
		boolean abbruch;	//premature user-caused abortion (if user wishes to abort)
		
		//Preparations
		System.out.println("Zahlraten (Version 0.99 vom 2015-OKT-10)");
		System.out.println();
		
		gefunden = false;	//number has not been found out yet
		abbruch = false;	//we do not want to abort (now that is)
		
		zahl = urne.nextInt(1000) + 1;	//get random number from 1 to 1000 range
		
		//loop for input of guessed Numbers:
		while( !gefunden && !abbruch )	//"!" equals NOT, "&&" equals AND
		{
			System.out.print("Gib Zahl zw. 1 und 1000 ein (oder 0 fuer Abbruch): ");
			eingabe = tastatur.readLine();
			//trying to interpret input as number
			x = Integer.parseInt(eingabe);
			
			if( x == 0 ) abbruch = true;	//save abortion-wish
			else if( x < zahl ) {
				System.out.print("Die eingegebene Zahl ist zu klein!");
				System.out.println();
			} else if( x > zahl ) {
				System.out.print("Die eingegebene Zahl ist zu gross!");
				System.out.println();
			} else {	//Now x == zahl HAS to be true
				gefunden = true;
			}
		}	//End of loop
			
			//Display of results
			System.out.println();
			if(gefunden)
				System.out.println("Das ist die Zahl - Gratulation!");
			else
				System.out.println("Schade! Sie haben die Zahl nicht gefunden. Mehr Glueck beim nächsten mal");
			

	}	//End of main 
}