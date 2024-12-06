package array;

import java.util.Arrays;

public class Boubble_Sort_Method {

	public static void main(String[] args) {


		// Normal method
		int a[]= {2,4,6,3,2,7,8,5,0};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//parallel sort method
		
		int c[]= {2,5,7,4,9,8,10};
		
		Arrays.parallelSort(c);
	String s=	Arrays.toString(c);
	System.out.println(s);
	
		// Boubble sort method
		
		int []b= {1,5,3,8,9,6,4,7,2};
		
		for(int i=0; i<b.length-1; i++) {
			
			for(int j=0; j<b.length-1-i; j++) {
				
				if(b[j]>b[j+1]) {
					
					int tem=b[j];
					b[j] =b[j+1];
					b[j+1]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(b));
		
		
	}

}
