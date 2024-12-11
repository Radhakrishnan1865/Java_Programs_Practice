package array;

import java.util.HashMap;

public class HashMap_Average{

	public static void main(String[]args){

		//Brian – 21
		//Lee – 22
		//Cathe – 45
		HashMap<String,Integer> map=new HashMap<>();
		
		map.put("Brian", 21);
		map.put("Lee", 22);
		map.put("Cathe", 45);
		
		int sum=0;
		int size=map.size();
		for(int age:map.values()) {
			
			sum=sum+age;
			
		}
		double avg=(double)sum/size;
		System.out.println(avg);
		//System.out.println(size);
	}
}
