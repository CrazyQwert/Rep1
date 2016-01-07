package vorfuehrAufgabe6;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class christmasTree {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( 
				new InputStreamReader(System.in));
		int n;
		
		System.out.print("Please enter the desired size of your Crhistmas-Tree: ");
		n = Integer.parseInt(tempinput.readLine());
		
		tree(n);
		
		//tree-stump
		spacing(n);
		System.out.println("*");
	}
	
	/**
	 * Prints a tree with a user specified number of branches
	 * 
	 * @param branches	number of branches
	 */
	public static void tree(int branches) {
		for (int i = 0; i <= branches; i++) {
			spacing(branches - i);
			branch(i);
			System.out.println();
			spacing(branches);
			System.out.println("*");
		}
	}
	
	/**
	 * Prints two space characters a user-specified number of times
	 * 
	 * @param quantity	number of spaces
	 */
	public static void spacing(int quantity) {
		for (int i = 0; i < quantity; i++) {
			System.out.print("  ");
		}
	}
	
	/**
	 * Generates a chain of "* " with double the length specified by the user + 1.
	 * Note that even with length 0 one "* " will get put out.
	 * @param length
	 */
	public static void branch(int length) {
		for (int i = 0; i <= length * 2; i++) {
			System.out.print("* ");
		}
	}

}
