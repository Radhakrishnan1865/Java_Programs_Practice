package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTOArayList {

	public static void main(String[] args) {
		
		Integer []array= {1,4,3,7,45,8,90,12};
		
		
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(list);
		
		Set<Integer> set=new HashSet<Integer>(list);
		System.out.println(set);
		/*
		 * Integer[]arr= {2,3,5,6,8,7,9,4};
		 * 
		 * System.out.println(Arrays.toString(arr));
		 * 
		 * List<Integer> li= Arrays.asList(arr);
		 * 
		 * ArrayList<Integer> alist=new ArrayList<Integer>(li);
		 * System.out.println(alist);
		 */	}

}
