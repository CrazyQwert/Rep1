package vorfuehrAufgabe5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L33tTranscription {
	
	public static void main(String[] args) throws java.io.IOException {
		
		//Initialisation
		BufferedReader tempinput = new BufferedReader( new InputStreamReader(System.in) );
		String transcriptionList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?, .";
		String[] leetTable = {
				"4", "8", "�",	//A, B, C
				"�", "3", "�",	//D, E, F
				"6", "}{", "|",	//G, H, I
				"_|", "|<", "1",	//J, K, L
				"/\\/\\", "/\\/", "0",	//M, N, 0
				"|>", "0_", "|2",	//P, Q, R
				"5", "7", "|_|",	//S, T, U
				"\\/", "\\/\\/", "�",	//V, W, X
				"�", "z",	//Y, Z
				"!!11!!!eleven",	//!
				"�",	//?
				",",	//,
				" ",	//Space
				".",
				"<?>"	//Character not recognised
		};
		boolean cont = true;
		
		//Declaration
		String userinput;
		int x;
		
		while( cont ) {
			
			//|_|53|2 |/\/57|2|_|�7|0/\/
			System.out.println("Please enter a sentence you want to be transcribed.");
			userinput = tempinput.readLine();	//�37�}{|/\/6 |/\/|>|_|7
			
			System.out.println();//5|>4�3|2
			
			for( int i = 0; i < userinput.length(); i++ ) {
				//534|2�}{|/\/6 �0|2 7}{3 |/\/�3� 0� 7}{3 �|_||2|23/\/7 �}{4|24�73|2 �0/\/\/3|273� 70 |_||>|>3|2�453
				x = transcriptionList.indexOf(userinput.toUpperCase().charAt(i));
				
				if( x != -1 ) {
					System.out.print(leetTable[x]); //0|_|7|>|_|7
				} else {
					//|_|/\/|</\/0\/\//\/ 5�/\/\801 �4|1 54�3
					System.out.print(leetTable[leetTable.length - 1]);
				}
			}
			
			System.out.println();	//5|>4�3|2
			System.out.println();
			
			//3/\/� |>|20/\/\|>7
			System.out.println("Do you want to continue transcription? (y/n)");
			userinput = tempinput.readLine();
			
			//�}{3�|<|/\/6 \/\/}{37}{3|2 |_|53|2 \/\/4/\/75 70 3/\/�
			if( userinput.toLowerCase().charAt(0) == 'n' ) {
				cont = false;
			}
		}
		
	}

}
