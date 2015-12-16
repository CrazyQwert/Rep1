package vorfuehrAufgabe6;

public class TranspositionChiffre {
	
	 public static void main(String[] args)  { 
		 String txt1 = "Die THI bietet jetzt auch UXD an! Super :-)";    
		 String txt2 = "In paradise city all girls are pretty.";    
		 String txt3 = "Ene mene mu - und raus bist DU!";    
		 String txt4 = "FtS..uh...ce...k ... U";
		 String txt5 = "Irey na  g dcaipiilrastll";
		 String s = txt5; // change s for testing purposes
		 String t;    
		 char[][] m; // Matrix with characters   
		 int n = 5; // Size of matrix, change to your liking  
		 
		 System.out.println("Text, original: " + s);    
		 System.out.println("Text einfuellen in Matrix ...");    
		 m = stringToMatrix(s, n);    
		 System.out.println("Matrix mit originalem Text:");    
		 printMatrix(m);
		 System.out.println("Matrix transponieren ...");    
		 m = transposeMatrix(m);    
		 System.out.println("Matrix mit gespiegeltem Text:");
		 printMatrix(m);
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
				matrix[x][i] = str.charAt(strIndex);	//Writing String index
				strIndex++;
			}
			
		}
		
		return matrix;	//returning char matrix containing string
	 }
	 
	 
	/**
	 * Prints out a two-dimensional char array
	 *  
	 * @param matrix	user-defined char array that is to be printed
	 */
	public static void printMatrix(char[][] matrix) {
		 
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[0].length; x++) {
				System.out.print(matrix[x][i] + " ");
			}
			System.out.println();
		}
		 
	 }
	 
	 
	/**
	 * This method mirrors a quadratic array. Uhhmmm ... I have no idea how to 
	 * explain which symmetry axis is being used. It is one of the diagonal ones
	 * however. OK. Have fun and be careful.
	 * 
	 * @param matrix	Array that is to be mirrored.
	 * @return			Mirrored array.
	 */
	public static char[][] transposeMatrix(char[][] matrix) {
		
		//creating an array of equal dimensions.
		char[][] mirroredArray = new char[matrix.length][matrix[0].length];

		//mirror process
		for (int x = 0; x < matrix.length; x++) {
			for (int i = 0; i < matrix[0].length; i++) {
				mirroredArray[x][i] = matrix[i][x];	//indices being interchanged
			}
		}
		
		return mirroredArray; 
	}
	 
	 
	/**
	 * This method converts a two-dimensional array into a string.
	 * @param matrix	Array that is to be converted
	 * @return			String converted from array.
	 */
	public static String matrixToString(char[][] matrix) {
		
		//initialising string so the compiler can work with it
		String output = "";
		
		//writing process
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[0].length; x++) {
				output = output + matrix[x][i];
			}
		}
		
		return output;
	}

 }
