package array;

import java.util.HashSet;
import java.util.Set;

public class Print_Duplecate_In_Two_Array {


		public static void main(String[] args) {
			
			int[]a= {1,2,3,4,5};
			int[]b= {6,7,8,9,4,1,2,3};
			
			
			
			Set<Integer> set=new HashSet<Integer>();
			
			for(int value:a) {
				
				set.add(value);
			}
			
			System.out.println("Duplicate values in the arrray: ");
			for(int value:b) {
				//set.add(value);
			
				if(set.contains(value)) {
					
					System.out.println(value);
					//set.remove(value);
				}
			}
}
}