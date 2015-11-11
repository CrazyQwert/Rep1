package vorfuehrAufgabe4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VowelRemoval {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String input;
		String inputLowerCase;
		
		//Program introduction
		System.out.println("This program is designed to remove all consonants of an entered String.");
		
		//Fetch user input
		System.out.println("Please enter a String:");
		input = tempinput.readLine();
		
		//Converting entered String to lower case so I only have to check for lower case letters instead for upper and lower case
		inputLowerCase = input.toLowerCase();
		
		/*
		 * the following combination of a for loop and an if statement checks for every entered letter
		 * whether it is a vowel. If so it will skip the output of this letter. 
		 */
		for( int i = 0; i <= input.length() - 1; ++i) {
			if( inputLowerCase.charAt(i) == 'a') {

			} else if( inputLowerCase.charAt(i) == 'e') {
				continue;
			} else if( inputLowerCase.charAt(i) == 'i') {
				continue;
			} else if( inputLowerCase.charAt(i) == 'o') {
				continue;
			} else if( inputLowerCase.charAt(i) == 'u') {
				continue;
			} else {
				System.out.print(input.charAt(i));
			}
		}
	}
}
