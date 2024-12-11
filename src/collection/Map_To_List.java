package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_To_List {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("radha", 1);
		map.put("kannan", 2);
		map.put("krishnan", 3);
		map.put("arun", 4);
		map.put("rasul", 5);
		
		List<String> key=new ArrayList<String>(map.keySet());
		
		System.out.println(key);
		
		List<Integer> value= new ArrayList<Integer>(map.values());
		System.out.println(value);
		
		List<Map.Entry<String, Integer>> entry=new ArrayList<>(map.entrySet());
		
		System.out.println("Array list value is : " + entry);
	}
}
