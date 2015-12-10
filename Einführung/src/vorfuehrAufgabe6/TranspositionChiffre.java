package vorfuehrAufgabe6;

public class TranspositionChiffre {
	
	 public static void main(String[] args)  { 
		 String txt1 = "Die THI bietet jetzt auch UXD an! Super :-)";    
		 String txt2 = "In paradise city all girls are pretty.";    
		 String txt3 = "Ene mene mu - und raus bist DU!";    
		 String txt4 = "FtS..uh...ce...k ... U";
		 String txt5 = "test";
		 String s = txt5; // s fuer Testzwecke verschieden besetzen   
		 System.out.println(s.length());
		 String t;    
		 char[][] m; // Matrix mit Zeichen    
		 int n = 5; // Matrixgroesse, beliebig waehlbar    
		 System.out.println("Text, original: " + s);    
		 System.out.println("Text einfuellen in Matrix ...");    
		 m = stringToMatrix(s, n);    
		 System.out.println("Matrix mit originalem Text:");    
		 printMatrix(m);    
		 System.out.println("Matrix transponieren ...");    
		 transposeMatrix(m);    
		 System.out.println("Matrix mit gespiegeltem Text:");    
		 printMatrix(m);    
		 System.out.println("Text aus Matrix extrahieren ...");    
		 t = matrixToString(m);    
		 System.out.println("Text, verschlüsselt: " + t);  
		 
	 } // end main
	 
	 
	 public static char[][] stringToMatrix( String str, int size ) {
		char[][] matrix = new char[size][size];
		
		if( str.length() > Math.pow(size, 2) ) {
			str.substring(0, (int)Math.pow(size, 2) - 1);
		} else {
			int tooShort = (int)Math.pow(size, 2) - str.length();
			for( int i = tooShort; i > 0; i-- ) {
				str = str + ".";
			}
		}
		
		int strIndex = 0;
		for( int i = 0; i < matrix.length; i++ ) {
			for( int x = 0; x < matrix[0].length; x++ ) {
				matrix[i][x] = str.charAt(strIndex);
				strIndex++;
			}
			
		}
		
		return matrix;
	 }
	 
	 
	 
	public static void printMatrix(char[][] matrix) {
		 
		for( int i = 0; i < matrix.length; i++ ) {
			for( int x = 0; x < matrix[0].length; x++ ) {
				System.out.print(matrix[i][x]);
			}
			System.out.println();
		}
		 
	 }
	 
	 
	 
	public static void transposeMatrix(char[][] matrix) {
		 
	}
	 
	 
	 
	public static String matrixToString(char[][] matrix) {
		String output;

		output = String.valueOf(matrix[0][0]);
		for( int i = 0; i < matrix.length; i++ ) {
			for( int x = 1; x < matrix[0].length; x++ ) {
				output = output + matrix[i][x];
			}
		}
		
		return output;
	}

 }
