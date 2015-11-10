package vorlesung2015_11_10;

public class SubstringExample {
	
	public static void main(String[] args) {
		
		String s;
		
		s = "Hello!";
		
		System.out.println(s.substring(1,4));
		
		System.out.println(s.substring(1,2));
		
		System.out.println(s.length());
		
		//Homework
		
		System.out.println(s.substring(3,3));
		
		//System.out.println(s.substring(3,9));	//String index out of range
		
		//System.out.println(s.substring(-3,3));	//String index out of range
		
		//System.out.println(s.substring(-3.3));	//compiler error
		
		/*if( s.substring(1,2) == s.charAt(1) ) {	//compiler error: different data types
			
		}*/
	}

}
