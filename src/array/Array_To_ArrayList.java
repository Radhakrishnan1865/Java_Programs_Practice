package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_To_ArrayList {

	public static void main(String[] args) {
		
		 String[] array = {"Apple", "Banana", "Cherry", "Apple"};
		 
		 System.out.println(array);
		 
		 List<String> list=new ArrayList<String>(Arrays.asList(array));
		 System.out.println(list);
		 
	}
}
