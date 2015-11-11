package vorfuehrAufgabe4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RipSentenceApart {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String userinput;
		
		//Program introduction
		System.out.println("Welcome. This program will put each individual word of an entered String in a new line.");
		
		//Fetching user input
		System.out.println("Please enter a String of your choosing:");
		userinput = tempinput.readLine();
		
		//Spacer
		System.out.println();
		
		//repeats as many times as there are characters contained in the String
		for( int i = 0; i <= userinput.length() - 1; ++i ) {
			//x will be used to check if there is more than one space character
			int x = i + 1;
			//prevents x from getting larger than the string.length() so that I wont get a "out of range" error with .charAt
			if( x > userinput.length() - 1 ) {
				x = i;
			}
			//checks whether there are space characters. If not it will print out the current character that is being checked
			if( userinput.charAt(i) == ' ' ) {
				//if there are space characters, checks whether there's another blank next. If so it skips, otherwise \n
				if( userinput.charAt(i) == ' ' && userinput.charAt(x) == ' ' ) {
					continue;
				} else {
					System.out.println();
				}
			} else {
				System.out.print(userinput.charAt(i));
			}
		}
		
	}

}
