package vorfuehrAufgabe4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringBackwards {

	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String input;	//String used to store user input
		
		//Program introduction
		System.out.println("This program will reverse an entered String.");
		System.out.println("Please enter a desired String for it to be reversed: ");
		
		//Fetching user input
		input = tempinput.readLine();
		
		//Reversing String
		for( int i = input.length() - 1; i >= 0; --i ) {
			System.out.print(input.charAt(i));
		}
	}
}
