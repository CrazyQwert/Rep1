package vorfuehrAufgabe2;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class QuadraticEquationSolver {
	
	public static void main(String[] args)
	throws java.io.IOException, InterruptedException
	{
		BufferedReader tempInput = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		
		double variableA;
		double variableB;
		double variableC;
		
		double discriminant;
		
		double solution1;
		double solution2;
		
		//short introduction of what the program does
		System.out.println("This program is supposed to solve quadratic equations.");
		
		//asking for first variable of quadratic equation
		System.out.print("Please enter variable 'a': ");
		userInput = tempInput.readLine();
		variableA = Integer.parseInt(userInput);
		
		//asking for second variable of quadratic equation
		System.out.print("Please enter variable 'b': ");
		userInput = tempInput.readLine();
		variableB = Integer.parseInt(userInput);
		
		//asking for third variable of quadratic equation
		System.out.print("Please enter variable 'c': ");
		userInput = tempInput.readLine();
		variableC = Integer.parseInt(userInput);
		
		//calculate discriminant to see if problem can be solved
		discriminant = variableB * variableB - 4 * variableA * variableC;
		
		//if variableA is 0, the solution is not quadratic anymore since ax^2 = 0
		if( variableA != 0 ){
			//check how many solutions there are for a quadratic equation
			if( discriminant < 0 ) {
				System.out.println("There is no solution to your quadratic equation!");
			} else if( discriminant > 0 ) {
				//calculating solution
				solution1 = ( -variableB + (Math.sqrt( variableB * variableB - 4 * variableA * variableC ))) / ( 2 * variableA );
				solution2 = ( -variableB - (Math.sqrt( variableB * variableB - 4 * variableA * variableC ))) / ( 2 * variableA );
				//Output
				System.out.println("The solution is { " + solution1 + " ; " + solution2 + " }");
			} else {
				solution1 = ( -variableB + (Math.sqrt( variableB * variableB - 4 * variableA * variableC ))) / ( 2 * variableA );
				//Output
				System.out.println("The solution is { " + solution1 + " }");
			}
		} else {
			//check whether b is 0. If b is 0, the solution is c
			if( variableB != 0 ) {
				System.out.println("This is not a quadratic equation, but a linear one!");
				Thread.sleep(1000);
				System.out.println("Continuing with solving linear equation:");
				solution1 = -variableC / variableB;
				System.out.println("The solution is { " + solution1 + " }");
			} else {
				System.out.println("The solution is { " + variableC + " }");
			}
		}
				
		Thread.sleep(2500);
		System.out.println("This better be right :S");
		
	
	}

}
