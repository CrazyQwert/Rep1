package vorfuehrAufgabe5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindShortestAndLongestName {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String[] nameList;	//Array where the names are to be stored
		int nameCount;	//Amount of names user wants to enter
		int nameLength;	//Length of the name
		String shortest;	//String for the shortest name
		String longest;	//String for the longest name ... duh!
		
		//Initilisation
		nameLength = 0;
		shortest = null;
		longest = null;
		
		//Program introduction
		System.out.println("This program lets you enter a set amount of names and finds the shortest and longest one of them.");
		System.out.println();
		
		//Get user input on how many names there are to enter
		System.out.println("How many names are you planning to enter?");
		nameCount = Integer.parseInt(tempinput.readLine());
		System.out.println();
		
		//Initialise the array with the number of names the user wants to enter
		nameList = new String[nameCount];
		
		//Fetching names
		System.out.println("You may now enter your names. If you want to end the procedure type \"-end-\".");
		for( int i = 0; i < nameList.length; ++i ) {
			System.out.print("Name: ");
			nameList[i] = tempinput.readLine();
			
			/*
			 * My super special method to let the user abort entering names.
			 * 
			 * Checks whether the user has typed -end-. If this is the case,
			 * it will overwrite -end- with null (so that it wont count towards
			 * being a name) and break out of the for-loop afterwards.
			 */
			if( nameList[i].equals("-end-") ) {
				nameList[i] = null;
				break;
			}
		}
		
		//Finding out the shortest name entered
		for( int i = 0; i < nameList.length; ++i ) {
			if( nameList[i] != null ) {
				nameLength = nameList[i].length();
				shortest = nameList[i];
			} else if( i > 0 && nameList[i] != null && nameList[i].length() < nameLength ) {
				nameLength = nameList[i].length();
			}
		}
		
		System.out.println(shortest);
		
		
	}

}
