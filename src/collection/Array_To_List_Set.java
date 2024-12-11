package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_To_List_Set {

public static void main(String[] args) {
		
		// Convert int array to String array
		
		int [] intArray= {1,2,3,4,5,6,3,1};
		
		String [] strArray= new String[intArray.length];
		
		for(int i=0; i<intArray.length; i++) {
			
			strArray[i]= String.valueOf(intArray[i]);
			//strArray[i]=Integer.toString(i);
			
		
		}
		
		System.out.println(String.join(",", strArray));
		
		// Convert String array to ArrayList
		
		List<String> alist=new ArrayList<String>(Arrays.asList(strArray));
		
		System.out.println("Array to Array list : " +alist);
		
		// Convert Array to HashSet 
		
		Set<String> set=new HashSet<String>(Arrays.asList(strArray));
		
		System.out.println("Array to Set : " +set);
		
		// Convert ArrayList to HashSet
		
		Set<String> hset= new HashSet<String>(alist);
		
		System.out.println("ArrayList to HashSet : " + hset);
	}
}
