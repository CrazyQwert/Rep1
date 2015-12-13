package vorfuehrAufgabe6;

public class TranspositionChiffre {
	
	 public static void main(String[] args)  { 
		 String txt1 = "Die THI bietet jetzt auch UXD an! Super :-)";    
		 String txt2 = "In paradise city all girls are pretty.";    
		 String txt3 = "Ene mene mu - und raus bist DU!";    
		 String txt4 = "FtS..uh...ce...k ... U";
		 String txt5 = "test";
		 String s = txt4; // change s for testing purposes 
		 System.out.println(s.length());
		 String t;    
		 char[][] m; // Matrix with characters   
		 int n = 5; // Size of matrix, change to your liking    
		 System.out.println("Text, original: " + s);    
		 System.out.println("Text einfuellen in Matrix ...");    
		 m = stringToMatrix(s, n);    
		 System.out.println("Matrix mit originalem Text:");    
		 printMatrix(m);
		 
		 t = matrixToString(m);    
		 System.out.println("Text, verschlüsselt: " + t);
		 System.out.println(t.length());
		 
		 System.out.println("Matrix transponieren ...");    
		 m = transposeMatrix(m);    
		 System.out.println("Matrix mit gespiegeltem Text:");
		 printMatrix(m);
		 System.out.println();
		 printMatrix(transposeMatrix(m));
		 System.out.println("Text aus Matrix extrahieren ...");    
		 t = matrixToString(m);    
		 System.out.println("Text, verschlüsselt: " + t);  
		 
	 } // end main
	 
	/**
	 * This Method converts a string to a quadratic char matrix with strings longer
	 * than the capacity of the char matrix being cut off and strings shorter being
	 * instead substituted with ".".
	 * 
	 * @param str		string the char matrix will be filled with
	 * @param size		size of the quadratic char matrix
	 * @return			char matrix containing string
	 */
	 public static char[][] stringToMatrix( String str, int size ) {
		char[][] matrix = new char[size][size];
		
		if (str.length() > Math.pow(size, 2)) {
			str.substring(0, (int)Math.pow(size, 2) - 1);	//String getting cut off
		} else {
			int tooShort = (int)Math.pow(size, 2) - str.length();	//Calculating missing characters
			for (int i = tooShort; i > 0; i--) {
				str = str + ".";	//Adding dots
			}
		}
		
		int strIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[0].length; x++) {
				matrix[i][x] = str.charAt(strIndex);	//Writing String index
				strIndex++;
			}
			
		}
		
		return matrix;	//returning char matrix containing string
	 }
	 
	 
	/**
	 * Prints out a two-dimensional char matrix
	 *  
	 * @param matrix	user-defined char matrix that is to be printed
	 */
	public static void printMatrix(char[][] matrix) {
		 
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[0].length; x++) {
				System.out.print(matrix[x][i] + " ");
			}
			System.out.println();
		}
		 
	 }
	 
	 
	 
	public static char[][] transposeMatrix(char[][] matrix) {
		char[][] arrayClone = new char[matrix.length][matrix[0].length];

		
		for (int x = 0; x < matrix.length; x++) {
			for (int i = 0; i < matrix[0].length; i++) {
				arrayClone[matrix.length - 1 - i][matrix.length - 1 - x] = matrix[x][i];
			}
		}
		
		matrix = arrayClone.clone();
		
		return matrix; 
	}
	 
	 
	 
	public static String matrixToString(char[][] matrix) {
		String output;

		output = String.valueOf(matrix[0][0]);
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[0].length; x++) {
				output = output + matrix[i][x];
			}
		}
		
		return output;
	}

 }
