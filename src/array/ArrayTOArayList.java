package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTOArayList {

	public static void main(String[] args) {
		
		Integer[]arr= {2,3,5,6,8,7,9,4};
		
		System.out.println(Arrays.toString(arr));
		
		List<Integer> li= Arrays.asList(arr);
		
		ArrayList<Integer> alist=new ArrayList<Integer>(li);
		System.out.println(alist);
	}

}
