package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		
		List<String> list=List.of("Apple","Banana","Cucumber","Orange","WaterMelon");
		
		Set<String>set=new HashSet<String>(list);
		System.out.println("Hasset values: "+set);
		
		Set<String>set1=new LinkedHashSet<String>(list);
		
		System.out.println("LinkedHasset value: "+ set1);
		
		
		 List<String> list1 = List.of("Apple", "Banana", "Apple", "Orange", "Banana");

	        // Convert List to HashSet (no guaranteed order)
	        Set<String> hashSet = new HashSet<>(list1);
	        System.out.println("HashSet: " + hashSet);

	        // Convert List to LinkedHashSet (maintains insertion order)
	        Set<String> linkedHashSet = new LinkedHashSet<>(list1);
	        System.out.println("LinkedHashSet: " + linkedHashSet);
	}
}
