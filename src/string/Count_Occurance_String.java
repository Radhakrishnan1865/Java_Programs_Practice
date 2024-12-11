package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Count_Occurance_String {

public static void main(String[] args) {
		
		String str="";
		
		String[]s=str.split(" ");
	Map<String,Integer> map= new HashMap<String,Integer>();
	
	String c="";
	for(int i=0; i<s.length; i++) {
		
		 c=s[i];
		if(map.containsKey(c)) {
			
			map.put(c,map.get(c)+1);
			
		}
		else
		{
			map.put(c,1);
		}
	}
	
	
	//System.out.println("number of occurance "+ map);
	
	int maxcount=0;
	String max=" ";
	
	for(Map.Entry<String,Integer> value: map.entrySet()) {
		
		if(value.getValue()>=1) {
			
			max=value.getKey();
			maxcount=value.getValue();
			System.out.println(value.getKey()+ "- is being repeated " + value.getValue() + "- times ");
		}
	}
	System.out.println( max + "Character with the maximum occurence : " + maxcount + " -times");
	//System.out.println(maxcount);
	
	}
}
