package string;

import java.util.Map.Entry;
import java.util.*;

public class RemoveDuplicate_FromString {

	public static void main(String[] args) {
		
		String s= "welcome to java selenium Automation";
		s=s.replaceAll(" ","");
		String s1="";
		//System.out.println(s);
		
		char[]ch= s.toCharArray();
		Map<Character,Integer> mp= new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<ch.length; i++) {
			if(mp.containsKey(ch[i])) {
				
			}
			else
				mp.put(ch[i], 1);
		
		}
		Set<Entry<Character, Integer>> entryset=mp.entrySet();
		for(Entry<Character, Integer> entry :entryset) {
			s1=s1+entry.getKey();
		}
		System.out.println(s1);
		System.out.println("------------------");
		
		
		// method 02
		
		String str="welcome to java selenium Automation";
		str=str.replaceAll(" ","");
	char[] c=str.toCharArray();
	
	Set<Character> set=new HashSet<Character>();
	
	for(char a:c) {
		
		set.add(a);
	}
	for(char c1:set) {
		System.out.print(c1);
	}
	
	}

}
