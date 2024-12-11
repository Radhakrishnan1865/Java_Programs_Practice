package array;

import java.util.LinkedHashSet;
import java.util.Set;

public class Join_Two_Array {

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4, 3};
		int[] array2 = {5, 6, 7, 8, 1, 6};
		
		int[] result = new int[array1.length + array2.length];
		
		// copy element in first array
		
		for(int i=0; i<array1.length; i++) {
			
			result[i]=array1[i];
		}
		// copy second array
		for(int i=0; i<array2.length; i++) {
			
			result[array1.length+i]=array2[i];
		}
		Set<Integer> s= new LinkedHashSet<Integer>();
		for(int i=0; i<result.length; i++) {

			s.add(result[i]);
			
		}
		System.out.println("Joined Array: ");
		for(int numbers:s) {
			System.out.print(numbers + " ");
		}
		
	}
}
