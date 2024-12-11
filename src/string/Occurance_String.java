package string;

import java.util.HashMap;
import java.util.Map;

public class Occurance_String {

	public static void main(String[] args) {
		
		 String str="I am an automation tester and I am a manual tester";
			        
			        //I is being repeated 2 times
			    //am is being repeated 2 times
			    //an is being repeated 1 time
			    //and so on..
			    String []s= str.split(" ");
			    Map<String,Integer> mp= new HashMap<>();
			    String s1="";
			    for(int i=0; i<s.length; i++){
			        
			    	 s1=s[i];
			        if(mp.containsKey(s1)) {
			        	
			        	mp.put(s1,mp.get(s1)+1);
			        	
			        }
			        else {
			        	
			        	mp.put(s1,1);
			        
			        }
			        
			       
			    }
			    for (Map.Entry<String, Integer> entry : mp.entrySet()) {
		            if (entry.getValue() >= 1) {
		                System.out.println(entry.getKey() + " is being repeated " + entry.getValue() + " times");
		            }
		        }
			   // System.out.print(mp + " is being repeated " + mp.get(s1)+ " times");   
	}
}
