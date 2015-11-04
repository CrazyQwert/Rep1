package vorfuehrAufgabe3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumbersPattern {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String userinput;
		int width;
		int result;
		
		//Request desired width from user
		System.out.print("Please enter a desired width the numbers pattern is to be drawn with: ");
		userinput = tempinput.readLine();
		width = Integer.parseInt(userinput);
		
		//Spacer
		System.out.println();
		System.out.println();
		
		//First, outer for is responsible for the number of lines
		for( int i = 0; i <= width; i++ ) {
			//Second, inner for is responsible for the actual displayed numbers per line
			for( int x = 0; x <= width; x++ ) {
				if( i == 0 ) {	//makes sure top factors are getting displayed
					result = 1 * x;
				} else if( i != 0 && x == 0 ) {	//makes sure left factors are getting displayed
					result = i * 1;
				} else {
					result = i * x;
				}
				System.out.print(" ");	//Spacer for table
				System.out.printf("%3d", result);	//Formatted output of three decimals
				System.out.print(" |");	//Spacer for table
			}
			System.out.println();	//line break
			
			//Horizontal table spacer
			for( int x = 0; x <= width; x++ ) {
				System.out.print("-----+");
			}
			System.out.println();	//line break
		}
		
		
	}

}
