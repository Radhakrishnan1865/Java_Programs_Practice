package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting_List {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		list.add("Radha");
		list.add("Kannan");
		list.add("Arun");
		list.add("Valarmathi");
		
		System.out.println("List before sorting : "+ list);
		
		list.sort(Comparator.naturalOrder());
		System.out.println("List ofter sorting Ascending order Using comparator : "+ list);
		
		list.sort(Comparator.reverseOrder());
		System.out.println("List after sorting Descending order Using comparator  : " + list);
		
		Collections.sort(list);
		System.out.println("List after sorting Ascending order Using Collections :" + list);
	}
}
