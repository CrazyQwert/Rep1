package vorfuehrAufgabe3;

public class timesTable {
	
	public static void main(String args[]) {
		
		int result;
		
		//First for increases first multiplier by 1 every line
		for( int i = 1; i <= 10; i++ ) {
			//Second for increases second multiplier by 1 for every step, but resets every line
			for (int x = 1; x <= 10; x++ ) {
				result = i * x;
				
				//Correcting the spacing for i
				if( i < 10 ) {
					System.out.print( " " + i );
				} else {
					System.out.print(i);
				}
				
				System.out.print(" * ");
				
				//Correcting the spacing for x
				if( x < 10 ) {
					System.out.print( " " + x );
				} else {
					System.out.print(x);
				}
				
				System.out.print( " = " + result + "	" );
			}
			System.out.println();
		}
	}

}
