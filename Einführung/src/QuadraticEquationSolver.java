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
		
		//calculating solution
		solution1 = ( -variableB + (Math.sqrt( variableB * variableB - 4 * variableA * variableC ))) / ( 2 * variableA );
		solution2 = ( -variableB - (Math.sqrt( variableB * variableB - 4 * variableA * variableC ))) / ( 2 * variableA );
		
		//check whether there is only one solution to this equation
		if( solution1 != solution2 ) {
			System.out.println("The solution is { " + solution1 + " ; " + solution2 + "}");
		} else {
			System.out.println("The solution is { " + solution1 + " }");
		}
		
		Thread.sleep(2500);
		System.out.println("This better be right :S");
		
		//testing stuff
		double test;
		
		test = variableB * variableB - 4 * variableA * variableC;
		System.out.println(test);
		//end of testing stuff
		
	}

}
