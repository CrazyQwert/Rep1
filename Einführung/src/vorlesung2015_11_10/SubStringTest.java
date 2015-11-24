package vorlesung2015_11_10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubStringTest {

	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String userInput;
		int i = 0;
		int helloCount = 0;
		int x = 5;
		
		System.out.println("Please enter a random sentence that contains a random amount of \"hello\" at random positions:");
		userInput = tempinput.readLine();
		
		System.out.println();
		
		
		
		while( true ) {
			
			i = userInput.indexOf("hello");
			
			if( i > -1 ) {
				++helloCount;
			} else {
				break;
			}
			userInput = userInput.substring(i + x, userInput.length());
		}
		
		if( helloCount > 0 ) {
			System.out.println("You wrote \"hello\" " + helloCount + " times.");
		} else if( helloCount == 0 && userInput.length() == 0 ) {
			System.out.println("This is not even a sentence!");
		} else {
			System.out.println("There is no \"hello\" in this sentence :'(");
		}
	}
}
