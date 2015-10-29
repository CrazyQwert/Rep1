import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SquareAndTriangle {
	
	public static void main (String args[]) 
			throws java.io.IOException {
		
		//Declaration of variables
		BufferedReader tempInput = new BufferedReader(new InputStreamReader(System.in));
		String userinput;
		
		int triangleWidth;
		
		//Asking user for the width of the triangle
		System.out.print("Enter desired triangle width: ");
		userinput = tempInput.readLine();
		triangleWidth = Integer.parseInt(userinput);
		
		//System.out.println(triangleWidth);
		
		//repeating steps for the width of the triangle
		for(int i = triangleWidth; i >= 0; i--) {
			//printing "x" for the triangle width. Decreases with each step.
			for(int x = i; x >= 0; x--) {
				System.out.print("x");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int count = 0;
		for(int i = triangleWidth; i >= 0; i--) {
		
			for(int w = 0; w <= count; w++) {
				System.out.print("x");
			}
			System.out.println();
			count++;
		}
		
		System.out.println();
		
		//count1 has to be outside the for loop so it is not constantly set to 0
		int count1 = 0;
		
		//repeating steps for the width of the triangle
		for(int i = triangleWidth; i >= 0; i--) {
			//printing "x" for the triangle width. Decreases with each step.
			for(int x = i - 1; x >= 0; x--) {
				System.out.print(" ");
			}
			System.out.print("x");
			for(int x = 1; x <= count1; x++) {
				System.out.print("x");
			}
			count1++;
			System.out.println();
		}
		
	}

}
