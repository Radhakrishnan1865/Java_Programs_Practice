package string;

import java.util.Arrays;

public class Anagram {
	
	public static boolean IsAnagram() {
		
		String s1="Heart";
		String s2="Earth";
		
		if(s1.length()!=s2.length()) {
			
			return false;
			
		}
		else {
			
		char a[]=	s1.toLowerCase().toCharArray();
		char b[]=s2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a,b);
		
		
		}
		
	}

	
	
	public static void main(String[] args) {
		
		System.out.println(IsAnagram());
		

	}

}
