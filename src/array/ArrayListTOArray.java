package array;

import java.util.ArrayList;

public class ArrayListTOArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(1);
		alist.add(3);
		alist.add(4);
		alist.add(9);
		alist.add(11);
		alist.add(5);
		alist.add(8);
		
		System.out.println(alist);
		Integer[]arr=new Integer[alist.size()];
		arr=alist.toArray(arr);
		
		for(int a:arr) {
			
			System.out.print(a+",");
		}

	}

}
