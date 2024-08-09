package string;

import java.util.HashSet;
import java.util.Set;

public class Extract_Duplicate_In_String {

	public static void main(String[] args) {
		
		String s="radha";
		
		// method 01
		Set<Character> seen= new HashSet<Character>();
		
		Set<Character> duplicate=new HashSet<Character>();
		
		for(char c: s.toCharArray()) {
			
			if(!seen.add(c)) {
				
				duplicate.add(c);
			}
		}

		System.out.println("Duplicate values in Sring -" +duplicate);
		System.out.println("Without Duplicate value in string : "+ seen);
		
		//method 02
		
		/*String s1="After that I will check my mail if there is any important mail I need to take action on";
		
		s1.toLowerCase();
		
		String []words=s1.split(s1);
		System.out.println("duplicate words in a given string");
		
		for(int i=0; i<words.length; i++) {
			
			for(int j=i+1; j<words.length)
		}*/
	}

}
