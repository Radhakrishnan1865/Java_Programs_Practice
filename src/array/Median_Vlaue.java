package array;

import java.util.Arrays;

public class Median_Vlaue {

public static void main(String[] args) {
		
		int []a={20,10,34,545,90,9,1,2131};
		
		int len=a.length;
		Arrays.sort(a);
		
		System.out.println("Sorted Array : " + Arrays.toString(a));
		if(len%2==0) {
			System.out.println((a[len/2-1]+a[len/2])/2);
			
		}
		else
			System.out.println(a[len/2]);
	}
}
