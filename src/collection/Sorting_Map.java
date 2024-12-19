package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sorting_Map {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<>();
		map.put("Dhoni", 79);
		map.put("Virat", 98);
		map.put("Koli", 72);
		map.put("Rohit", 68);
		map.put("Sharma", 89);
		
		List<Map.Entry<String,Integer>> list= new ArrayList<>(map.entrySet());
		list.sort(Map.Entry.comparingByValue());
		
		Map<String,Integer> sortedmap= new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> entry:list) {
			
			sortedmap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(sortedmap);
	}
}
