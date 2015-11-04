package vorfuehrAufgabe3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LetterSquare {
	
	public static void main (String[] args) throws java.io.IOException, InterruptedException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		
		String userinput;
		int squareWidth;
		char character;
		char exit = 'n';
		
		do {
			//Program introduction
			System.out.println("Hello there! You will now get to choose a desired width and character to render a square with.");
			
			//Retrieving and saving square dimensions
			System.out.print("Please enter a square width you feel comfortable with: ");
			userinput = tempinput.readLine();
			squareWidth = Integer.parseInt(userinput);
			
			//Spacer
			System.out.println();
			
			//Retrieving and saving character square consists of
			System.out.print("Now choose a character of your liking that will be used to draw the square: ");
			userinput = tempinput.readLine();
			character = userinput.charAt(0);
			
			//Spacer
			System.out.println();
			
			//Drawing the square. First for makes sure required lines get drawn.
			for( int i = 1; i <= squareWidth; i++ ) {
				//Inner for makes sure the lines contain the required characters
				for( int x = 1; x <= squareWidth; x++ ) {
					System.out.print(character + " ");
				}
				System.out.println();
			}
			
			//Exit prompt
			System.out.println();
			System.out.print("Do you want to exit? (y/n): ");
			userinput = tempinput.readLine();
			exit = userinput.charAt(0);
			
			//Spacer
			System.out.println();
			System.out.println("------------");
			System.out.println();
			
		} while( exit != 'y');
	}

}