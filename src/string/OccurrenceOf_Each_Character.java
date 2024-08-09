package string;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOf_Each_Character {

	public static void main(String[] args) {

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
		System.out.println(map);//{A=2, B=2, C=1, D=1, E=1}

	}

}
