package vorfuehrAufgabe4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OnlyMainWords {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String sentence;
		
		//Program introduction
		System.out.println("This program will read in a sentence and only output the words beginning with a capital Letter.");
		System.out.println();
		
		//Fetching user input
		System.out.println("Please enter a sentence:");
		sentence = tempinput.readLine();
		
		for( int i = 0; i < sentence.length(); ++i ) {
			if( Character.isUpperCase(sentence.charAt(i)) ) {	//Checks whether a character is in capitals or not
				while( Character.isAlphabetic(sentence.charAt(i)) ) {	//Continues for as long as there are alphabetic characters (no blanks)
					System.out.print( sentence.charAt(i) );
					++i;
					
					if( i > sentence.length() - 1 ) {	//Fail-safe to prevent "out of range" error
						i = sentence.length();
						break;
					}
				}
				System.out.println();	//Linebreak to ensure every word is in its own line
			
			}
		}
		
	}

}
