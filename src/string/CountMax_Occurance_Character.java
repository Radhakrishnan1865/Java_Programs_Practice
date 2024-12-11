package string;

import java.util.HashMap;
import java.util.Map;

public class CountMax_Occurance_Character {

	public static void main(String[] args) {
		
		String str="radhakrishnan";
		
	Map<Character,Integer> map= new HashMap<Character,Integer>();
	
	for(int i=0; i<str.length(); i++) {
		
		char c=str.charAt(i);
		if(map.containsKey(c)) {
			
			map.put(c,map.get(c)+1);
			
		}
		else
		{
			map.put(c,1);
		}
	}
	
	
	System.out.println("number of occurance "+ map);
	
	int maxcount=0;
	char max='\0';
	
	for(Map.Entry<Character,Integer> value: map.entrySet()) {
		
		if(value.getValue()>maxcount) {
			
			max=value.getKey();
			maxcount=value.getValue();
		}
	}
	System.out.println(max);
	System.out.println(maxcount);
	}
}
