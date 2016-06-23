package pruefungsVorbereitung;


public class DiagSum {
	
	public static void main(String[] args) {
	
		int[][] arr = { {10, 20, 30, 40},
						{33, 45, 23, 32},
						{26, 23, 13, 8},
						{41, 11, 14, 52}
					};
	
		System.out.print(calcDiagSum(arr));
		
		
		
		
	}
	
	public static int calcDiagSum(int[][] field) {
		
		int sum = 0;
		
		int[] sumArr = new int[field.length -1];
		
		for (int i = 1; i < field.length; i++) {
			
			int x = 1;
			int y = 0;
			
			sumArr[i - 1] = 0;
			
			while (true) {
				if (x < field.length && y < field[0].length) {
					sumArr[i - 1] += field[y][x];
					x++;
					y++;
				} else {
					break;
				}
			}
		}
		
		for (int i = 0; i < sumArr.length; i++) {
			sum += sumArr[i];
		}
		
		return sum;
	}
}
