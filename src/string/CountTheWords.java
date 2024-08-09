package string;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
	
		String s="rakki bhai";
		
		// method 01
		s=s.replaceAll(" ","");
		int count=1;
		
		for( int i=0; i<s.length()-1; i++) {
			
		//	if((s.charAt(i)==' ')  && (s.charAt(i+1)!=' ')) {
				
				
			//}
		count++;
		}
		
		System.out.println(" Number of words in your string :" + count);
		
		// method 02
		
		String str= "Radhakrishnan";
		 int co;
		co= str.length();
		// for()
		System.out.println(co);
		
		
		
	}

}
