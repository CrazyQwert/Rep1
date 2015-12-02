package vorfuehrAufgabe5;

import java.util.Arrays;

public class sortArray {
	public static void main(String[] args) {
		
		//Declaration
		int[] output;
		boolean[] alreadyCopied;
		int extreme;
		
		//Initialisation
		int[] input = {
				5, 8, 7, 9,
				0, 3, 6, 4,
				1, 2
				
		};
		/*
		 * Because of the fact that int-arrays do get initialised with 0
		 * by default, I have to make sure, that only the items I have
		 * written get displayed. I could do a check whether or not an
		 * item is 0 to see if it has been written yet, but then I'll
		 * get a conflict with numbers that actually are 0.
		 * So the output has to get handled by "outputLength".
		 */
		int outputLength = 0;
		
		//Definition
		output = new int[input.length];
		alreadyCopied = new boolean[input.length];
		Arrays.fill(alreadyCopied, false);
		/*
		 * I can't manage the output of my "input"-Array the same way I did
		 * with my "output"-Array, since the numbers here are in random order.
		 * So I have to make sure, that when I take out a number in the middle
		 * of the array it wont get displayed. To ensure this, I have created yet
		 * another array (this time a boolean array) that only saves whether a
		 * number may get displayed or not.
		 */
		extreme = 0;
		
		//Output sequence
		System.out.print("( ");
		for( int i = 0; i < input.length; ++i ) {
			if ( alreadyCopied[i] == false ) {
				//Formatted output to make sure I'm prepared for double-digit numbers
				System.out.printf("%2d ", input[i]);
			}
		}
		System.out.print(") ---> ( ");
		for (int i = 0; i < outputLength; i++) {
			System.out.printf("%2d ", output[i]);
		}
		System.out.println(")");
		
		//Repeat the behaviour for the length of the array
		for( int x = 0; x < input.length; x++ ) {
			
			/*
			 * Since I can't delete entries off of an array, I will have to use
			 * my boolean array to make sure, they do not get involved in finding
			 * the largest or smallest number. By that I prevent my algorithm from failing
			 * because it would use the smallest number over and over again, otherwise.
			 * 
			 * Also to make all of this work I will first have to choose an entry
			 * I will compare the others to. Now if I choose a random value that is
			 * not the largest value within the array, I would exclude all larger values
			 * from my algorithm since it would only look for values smaller than the
			 * random value I chose. So I first off have to make sure, that I use the largest
			 * value to compare the others to.
			 */
			
			//Finding the largest value
			for (int i = 0; i < input.length; ++i) {
				if( input[i] > input[extreme] && alreadyCopied[i] != true ) {
					extreme = i;
				}
			}
			
			//Finding the smallest value
			for (int i = 0; i < input.length; ++i) {
				if( input[i] < input[extreme] && alreadyCopied[i] != true ) {
					extreme = i;
				}
			}
			
			//set my boolean value to true for the number that has been found so it won't get used again
			alreadyCopied[extreme] = true;
			output[outputLength] = input[extreme];
			//Another value has been found --> output increases by one.
			++outputLength;
			
			
			//Output Sequence
			System.out.print("( ");
			for( int i = 0; i < input.length; ++i ) {
				if ( alreadyCopied[i] == false ) {
					System.out.printf("%2d ", input[i]);
				}
			}
			System.out.print(") ---> ( ");
			for (int i = 0; i < outputLength; i++) {
				System.out.printf("%2d ", output[i]);
			}
			System.out.println(")");
			
		}
	}
}
