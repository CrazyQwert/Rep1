package vorlesung2015_11_10;

public class EqualsTest {

	public static void main(String[] args) {
		
		String s1 = "Hallo";
		String s2 = "Hello";
		
		if(s1.equals("Hello")) {
			System.out.println("wahr");
		} else {
			System.out.println("false");
		}
		
		//nicht verwenden, weil vergleicht Refernzen und nicht Inhalte (Adi fragen)
		if(s1 == s2 || (s1 == "Hallo")){
			System.out.println("wahr1");
		} else {
			System.out.println("false1");
		}
	}

}
