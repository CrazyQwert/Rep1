package vorfuehrAufgabe5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NameSavingAndOutput {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		
		String nameList[];
		String shortest;	//variable for the shortest of all entered names
		String longest;	//variable for the longest of all entered names
		int arrayCount;
		int nameNumber;
		double douche;
		boolean noNamesEntered;
		
		//Initialising stuff
		arrayCount = 0;
		nameNumber = 0;
		noNamesEntered = false;
		longest = null;
		shortest = null;
		
		//Introducing program
		System.out.println("This program will store entered names and output the longest and shortest of them.");
		
		//Spacer
		System.out.println();
		
		//Getting number of names to be entered
		System.out.println("How many names do you want to enter?");
		//Creating failsafe for someone who enters 0, a negative number or a decimal
		while( Math.abs(nameNumber) == 0 ) {
			
			System.out.println("Error. You must enter at least one name for this to work!");
			System.out.println("Please type the number of names you want to save:");
			douche = Double.parseDouble(tempinput.readLine());
			nameNumber = (int)Math.floor(Math.abs(douche));
			
			if( douche < 0 ) {
				System.out.println("Negative numbers will be converted to positives. Nice try, though.");
			}
			
		}
		
		//Intitialising array using user input
		nameList = new String[nameNumber];
		
		//Introducing user to name-entering procedure
		System.out.println("It is now time to enter the Names. We'll do one at a time.");
		System.out.println("If you want to end entering Names type \"-end-\"");
		
		for( int i = 0; i < nameNumber; ++i ) {
			
			System.out.println("Please enter a name:");
			nameList[arrayCount] = tempinput.readLine();
			System.out.println("You entered: " + nameList[arrayCount]);
			
			//Checking whether user wants to end input-phase
			if( nameList[arrayCount] == "a" ) {
				//deletes last input after end-command so that it does not count towards being a name
				nameList[arrayCount] = null;
				break;
			}
			
			//Desc pending
			++arrayCount;
		}
		
		int previous = 0;
		//finding the longest name
		for( int i = 0; i < nameNumber; ++i ) {
			if( nameList[i].length() > previous && nameList[i] != null ) {
				longest = nameList[i];
				previous = nameList[i].length();
			} else {
				//System.out.println("No names were entered!");
				//noNamesEntered = true;
				//break;
			}
			
		}
		
		if( noNamesEntered != true ) {
			previous = longest.length();
			//finding shortest name
			for( int i = 0; i < nameNumber; ++i ) {
				if( nameList[i].length() <= previous && nameList[i] != null ) {
					shortest = nameList[i];
				} else {
					System.out.println("No names were entered!");
					noNamesEntered = true;
					break;
				}
			}

			//Spacer
			System.out.println();
			
			//Outputting longest and shortest names
			System.out.println("The longest name is: " + longest);
			System.out.println("The shortest name is: " + shortest);
		}
		
		
	}

}
