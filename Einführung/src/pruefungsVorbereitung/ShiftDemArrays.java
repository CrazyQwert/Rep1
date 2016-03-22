package pruefungsVorbereitung;

public class ShiftDemArrays {
	
	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 4};
		
		shift(array, 99, 2);
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		
		
	}
	
	public static void shift(int[] a, int ersatz, int verschiebung) {
		
		/*
		 * der letzte wert ist nun der letzte wert - verschiebung.
		 * mit jedem durchgang verschiebt sich das ersetzten eins nach oben
		 */
		for (int i = 0; i < a.length - verschiebung; i++) {
			a[a.length - 1 - i] = a[a.length - 1 - verschiebung - i];
		}
		/*
		 * ersetze vordere Stellen durch 'verschiebung'
		 */
		for (int i = 0; i < verschiebung; i++) {
			a[i] = ersatz;
		}
		
	}

}
