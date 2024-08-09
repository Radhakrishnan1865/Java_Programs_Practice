package string;

public class AllSubstring_IN_String {

	
	public static void main(String[] args) {
		
		String s="Radha";
		
		for(int i=0; i<s.length(); i++) {
			
			for(int j=i+1; j<=s.length();j++) {
				
			String str=	s.substring(i, j);
			
			System.out.println(str);
			}
		}
			
			
	}
}
