package string;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;
public class FirstNonRepated_Character {

	public static void main(String[] args) {
		
		// without using collection
		String s="ABCDABE";
		
		for(int i=0; i<s.length(); i++) {
			
			boolean unique=true;
			for(int j=0; j<s.length(); j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					unique=false;
				}
			}
			if(unique) {
				System.out.println(s.charAt(i));
				break;
			}
		}

		// with collection
		String str="ABCDABE";
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {	
		char c=str.charAt(i);
		
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}else
		{
			map.put(c, 1);
		}
		
		}
		System.out.println(map);
		
		for(Entry<Character,Integer> entryset:map.entrySet()) {
			if(entryset.getValue()==1) {
				System.out.println(entryset.getKey());
				break;
			}
		}
	}

}
