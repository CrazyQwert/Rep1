package learning;

public class MethodenBeispiele {
	
	public static void main(String[] args) {
		
		String blub = "Tschau";
		ausgeben(blub, 5);
		ausgeben2(blub, 5);
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		int i;
		
		
		
	}
	
	public static void ausgeben(String text, int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			System.out.println(text);			
		}
	}
	public static void ausgeben2(String eingabe, int anzahl) {
		for (int i = 0; i < anzahl; i++) {
			System.out.println(eingabe);			
		}
	}
	
	public static String stringeling() {
		return "Hallo";
	}
	
	public static int ergebnis() {
		return 3 + 5;
	}
}
