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
		
		//Checks whether the absolute of Delta is bigger than 0.001 so we don't need to check for positives and negatives separately
		while ( Math.abs(delta) > 0.001 ) {
			root = (upper + lower) / 2;	//Approximation
			delta = root * root - square;	//Calculating delta by subtracting the entered number from our approximated solution
			if(delta > 0) {	//Adjusts the lower and upper boundaries accordingly
				upper = root;
			} else if(delta < 0) {
				lower = root;
			} else {
				System.out.println("The root of " + square + " is " + root);
			}
			System.out.println("Run " + i + " : "
					+ "root = " + root + "	"
					+ "delta = " + delta + "	"
					+ "lower = " + lower + " 	"
					+ "upper= " + upper);
			i++;	//Increase the number of steps
		}
		System.out.println("The root of " + square + " is " + root);
	}

}
