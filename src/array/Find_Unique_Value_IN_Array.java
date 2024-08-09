package array;

import java.util.HashMap;
import java.util.Map;

public class Find_Unique_Value_IN_Array {


	static int[]array= {1,2,3,1,2};
	public static int FindUniqueValue(int[]arr) {
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int num: arr) {
			if(map.get(num)==1) {
				return num;
				
			}
			
		}
		return 0;
	}
	public static void main(String[] args) {
		
	int value=FindUniqueValue(array);
		
	System.out.println(value);
	}

	

}
