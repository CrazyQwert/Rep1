package vorfuehrAufgabe6;

public class GreyscaleImage {
	
	public static void main(String[] args)  {    
		int[][] picture = {        // represents an image with a 8x5 pixel-raster         
				 {199, 235, 140, 255, 23, 190, 45, 192},        
				 { 9, 122, 66, 218, 10, 201, 100, 245},        
				 { 33, 200, 8, 169, 250, 198, 1, 202},        
				 { 9, 122, 66, 218, 10, 201, 100, 245},        
				 { 9, 122, 66, 218, 10, 201, 100, 245}
		};      
		System.out.println("Pixel-Matrix des Bildes (Helligkeiten):");    
		printValues(picture);  
		System.out.println("relative Helligkeit: " +        
				relativeLuminance(picture) + " Prozent");
		
		} // end main 
	
	/**
	 * Prints out a two-dimensional array.
	 * 
	 * @param values	two dimensional array which is to be printed out
	 */
	public static void printValues(int values[][]) {
		for (int i = 0; i < values.length; i++) {
			for (int x = 0; x < values[0].length; x++) {
				System.out.printf("%3d ", values[i][x]);
			}
			System.out.println();
			System.out.println();
		}
	}
	
	/**
	 * Returns overall percentage of luminance when 255 stands for 100%.
	 * 
	 * @param value	array containing luminance values
	 * @return	overall luminance percentage
	 */
	public static int relativeLuminance(int[][] value) {
		
		double sum = 0;
		double test = (double)100 / (double)255;
		int luminance = 0;
		for (int i = 0; i < value.length; i++) {
			for (int x = 0; x < value[0].length; x++) {
				sum = sum + test * (double)value[i][x];
			}
		}
		luminance = (int)Math.round(sum / (value.length * value[0].length));
		
		return luminance;
	}
}

