package string;

public class Vowels_Consonant_Count_String {

	public static void main(String[] args) {
		
		String s=" Hello Good Morning";
		s=s.replaceAll(" ", "");
		String s1= s.toLowerCase();
		
		int Vowels_count=0;
		int consonant_count=0;
		
		for(int i=0; i<s1.length(); i++) {
			
			char c= s1.charAt(i);
			/*
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u' ) {
				
				
				count++;
			}*/
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				Vowels_count++;
			}
			else
				consonant_count++;
		}
		System.out.println(Vowels_count);
		System.out.println(consonant_count);

	}

}
