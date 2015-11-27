package vorfuehrAufgabe5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindShortestAndLongestName {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String[] nameList;	//Array where the names are to be stored
		int nameCount;	//Amount of names user wants to enter
		String shortest;	//String for the shortest name
		String longest;	//String for the longest name ... duh!
		
		//Definition
		shortest = null;
		longest = null;
		
		//Program introduction
		System.out.println("This program lets you enter a set amount of names and finds the shortest and longest one of them.");
		System.out.println();
		
		//Get user input on how many names there are to enter
		System.out.println("How many names are you planning to enter?");
		nameCount = Integer.parseInt(tempinput.readLine());
		System.out.println();
		
		//Define the array with the number of names the user wants to enter
		nameList = new String[nameCount + 1];
		
		//Fetching names
		System.out.println("You may now enter your names. If you want to end the procedure type \"-end\".\n"
				+ "If you need to correct an entry type \"-correction\".");
		for( int i = 0; i < nameList.length; ++i ) {
			
			if( i == nameList.length - 1 ){
				System.out.println("Do you need to correct your last entry? -yes / -no");
			} else {
				int count = i + 1;	//Variable for the current name that has to be entered
				System.out.print("Name " + count +": ");
			}
			nameList[i] = tempinput.readLine();
			
			/*
			 * My super special method to let the user abort entering names or correct mistyped ones.
			 * 
			 * Checks whether the user has typed -end-. If this is the case,
			 * it will overwrite -end- with null (so that it wont count towards
			 * being a name) and break out of the for-loop afterwards.
			 * 
			 * When correcting 'i' will be set back so you can overwrite the previous entry
			 */
			if( nameList[i].equals("-end") || (!nameList[i].equals("-yes") && i == nameList.length - 1) ) {
				nameList[i] = null;
				break;
			} else if( nameList[i].equals("-correction") && i == 0 ) {
				System.out.println("You will first have to enter a name to correct it or type \"-end\"");
				--i;
			}
			else if ( nameList[i].equals("-correction") || (nameList[i].equals("-yes") && i == nameList.length - 1) ) {
				nameList[i] = null;	//preventing a bug where typing correction 2 or more times the command will be counted as name
				i = i - 2;
			}
		}
		
		nameCount = 0;	//resetting 'nameCount' so it can be used to count the number of valid entries
		
		//Finding out the shortest name entered
		for( int i = 0; i < nameList.length; ++i ) {
			//Checking whether something was entered
			if( nameList[i] != null && nameList[i].length() != 0 ) {
				//Checking whether or not 'shortest' has been assigned a value yet
				if( shortest != null ) {
					//If current entity has less characters than 'shortest' update 'shortest' to the current entity
					if( nameList[i].length() < shortest.length() ) {
						shortest = nameList[i];
						++nameCount;
					}
				//If 'shortest' has not yet been assigned a value, assign value of the current entity
				} else {
					shortest = nameList[i];
					++nameCount;
				}
			}
		}
		
		//Finding out the longest name entered (works just like the check for the shortest name)
		for( int i = 0; i < nameList.length; ++i ) {
			if( nameList[i] != null && nameList[i].length() != 0 ) {
				if( longest != null ) {
					if( nameList[i].length() > longest.length() ) {
						longest = nameList[i];
					}
				} else {
					longest = nameList[i];
				}
			}
		}
		
		//Spacer
		System.out.println();
		
		//Determine what to read out
		//If shortest has not been assigned a value no valid names have been entered
		if( shortest == null ) {
			System.out.println("You did not enter any names you evil monster trying to break my program!");
		//If 'shortest' equals 'longest' it means either that only one name has been entered or that all of them have the same length
		} else if( shortest.length() == longest.length() && nameCount > 1 ) {
			System.out.println("All your names are equally as long with " + shortest.length() + " characters!");
		} else if( shortest.length() == longest.length() && nameCount == 1 ) {
			System.out.println("You only entered one name with the lenght of " + shortest.length() + " characters.");
		} else {
			System.out.println("The shortest name is \"" + shortest + "\" with " + shortest.length() + " characters!");
			System.out.println("The longest name is \"" + longest + "\" with " + longest.length() + " characters!");
		}
	}

}
