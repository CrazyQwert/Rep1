package vorfuehrAufgabe3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ApproximateSquareroots {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );

		double square; //User defined number of which the square root shall be approximated
		//Let user select a positive Number
		System.out.print("Please enter a positive Number of which the squareroot shall be approximated: ");
		square = Double.parseDouble(tempinput.readLine());
		
		double lower = 0;
		double upper = square;
		double root = ( upper + lower ) / 2;
		double delta = root * root - square;
		
		//Program introduction
		System.out.println("Root extraction by systematic guessing.");
		System.out.println();

		
		int i = 1;	//Variable to measure the amount of steps needed to approximate the square root
		
		while ( Math.abs(delta) > 0.001 ) {

			root = (upper + lower) / 2;
			delta = root * root - square;
			if(delta > 0) {
				upper = root;
			} else if(delta < 0) {
				lower = root;
			} else {
				System.out.println("Die Wurzel von " + square + " ist " + root);
			}
			System.out.println("Durchlauf " + i + " : root= " 
					+ root
					+ " 	delta= " + delta + " 	lower= " 
					+ lower + " 		upper= "
					+ upper);
			i++;
		}
		System.out.println("Die Wurzel von " + square + " ist " + root);
	}

}
