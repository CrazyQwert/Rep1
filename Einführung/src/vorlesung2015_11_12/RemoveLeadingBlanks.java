package vorlesung2015_11_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveLeadingBlanks {
	
	public static void main(String[] args) throws java.io.IOException {
		
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String userinput;
		int i = 0;
		
		System.out.println("Geben Sie einen Satz ein:");
		userinput = tempinput.readLine();
		
		System.out.println("vorher:");
		System.out.println("<" + userinput + ">");
		
		while( (userinput.length() > 0) && (userinput.charAt(i) == ' ') ) {
			++i;
			if( i >= userinput.length() ) {
				break;
			}
		}
		
		userinput = userinput.substring( i, userinput.length() );
		
		System.out.println("<" + userinput + ">");
	}

}
