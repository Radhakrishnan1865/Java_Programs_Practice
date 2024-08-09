package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseEachWordInString_removeDuplicate {

	public static void main(String[] args) {
		 
		String s= "WELCOME TO JAVA";
		
	String[] s2=s.split(" ");
	String rev="";
	for(String w:s2) {
		
		String reverse="";
		for(int i=w.length()-1; i>=0; i--) {
			
			reverse=reverse+w.charAt(i);
		}
		rev=rev+reverse+" ";
		
	}
	System.out.println(rev);//EMOCLEW OT AVAJ 
	
	//remove duplicae
char[]re=rev.toCharArray();
	Set<Character> set= new LinkedHashSet<Character>();
	
	for(char c:re) {
		
		set.add(c);
	}
	for(char ch:set) {
		System.out.print(ch);
	}
	
	}

}
