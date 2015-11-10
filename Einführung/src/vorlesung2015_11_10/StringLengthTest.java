package vorlesung2015_11_10;

public class StringLengthTest {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		
		
		int x = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(x));
			++x;
		}
		
		for(int i = s.length(); i > 0; i--) {
			System.out.print(s.charAt(i - 1));
		}
	}

}
