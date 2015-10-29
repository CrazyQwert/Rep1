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
		
		for (int i = triangleWidth; i >= 0; i--) {
			for(int x = i; x >= 0; x--) {
				System.out.print("x");
			}
			System.out.println();
		}
		
	}

}
