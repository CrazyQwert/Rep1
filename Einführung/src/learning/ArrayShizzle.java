package learning;

public class ArrayShizzle {
	
	public static void main(String[] args) {
		
		int[] intArray;
		
		intArray = new int[6];
		
		intArray[4] = 5;
		
		
		int[] intArray2 = { 3, 5, 6, 8};	
		
		int[][] intArray3 = { {2, 3}, {8, 6, 8} };

		int[][][] intArray4 = new int[7][5][6];
		
		for (int i = 0; i < intArray4.length; i++) {
			for (int k = 0; k < intArray4[0].length; k++) {
				for (int j = 0; j < intArray4[0][0].length; j++) {
					System.out.println(intArray4[i][k][j]);
				}
			}
		}
		
		
		System.out.println(intArray3[0].length);
		System.out.println(intArray3[1].length);
		
	
	}

}
