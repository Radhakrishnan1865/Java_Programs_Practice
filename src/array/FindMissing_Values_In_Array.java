package array;

import java.util.ArrayList;

import java.util.List;

public class FindMissing_Values_In_Array {

	public static void main(String[] args) {
		
		int[]arr= {1,3,5,7,9,11};
		
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		int min=1;
		int max=11;
		
		List<Integer> missingValues= new ArrayList<>();
		int currentValue=0;
		for(int i=min; i<=max; i++) {
			
			if(currentValue<arr.length && arr[currentValue]==i) {
				
				currentValue++;
			}else
				missingValues.add(i);
		}
		System.out.println(missingValues);
	}
}
