package string;

import java.util.ArrayList;
import java.util.List;

public class Second_Smallest_String {

	public static void main(String[] args) {
		
		String str="Use this editor to write compile and run your java code online in";
		
		String[]s= str.split(" ");
		
		int min_Length=Integer.MAX_VALUE;
		
		List<String> smallestWords= new ArrayList<String>();
		
		// find smallest String
		for(String words:s) {
			
			int length=words.length();
			if(length>min_Length) {
				min_Length=length;
				smallestWords.clear();
				smallestWords.add(words);
			}
			else if(length==min_Length) {
				smallestWords.add(words);
			}
		}
		
		// find Second Smallest String
		if(smallestWords.size()>1) {
			
			System.out.println("Second smallest String : " + smallestWords.get(1));
		}
		else if(smallestWords.size()==1) {
			
			System.out.println("Smallest String : " + smallestWords.get(0));
		}
		else
			System.out.println("No Strings are fouund");
	}
}
