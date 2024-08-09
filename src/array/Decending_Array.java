package array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Decending_Array {

	public static void main(String[] args) {

		int []b= {400,300,900,100,500,800};

		//method 01
		for(int i=0; i<b.length; i++) {
			
			for(int j=i+1; j<b.length; j++) {
				
				if(b[i]<b[j]) {
					
					int tem=b[i];
					b[i] =b[j];
					b[j]=tem;
					
				}
			}
			System.out.println(b[i]);
		}
		
		//method 02

		Integer[]a= {2,4,5,3,6,9,7,8};
		Arrays.sort(a,Collections.reverseOrder());
		String s= Arrays.toString(a);
		System.out.println(s);
		
	}

}
