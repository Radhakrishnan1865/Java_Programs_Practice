package numbers;

import java.util.ArrayList;
import java.util.List;

public class Number_Start_With {

	public static int getFirstDigit(int num) {
		
		while(num>= 10) {
			num=num/10;
		}
		return num;
	}
	public static List<Integer> getNumberList(int arr[]) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int num:arr) {
			
		int number=getFirstDigit(num);
			if(number==1) {
				
				list.add(num);
			}
			
		}
		return list;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,23,134,34,142,165};
		System.out.println(getNumberList(arr));
	}
}
