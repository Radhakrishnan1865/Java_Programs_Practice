package array;

import java.util.Arrays;

public class Minimum_Number_Array {

	public static void main(String[] args) {
		
		int []b= {400,300,900,100,500,800};

		//method01
		for(int i=0; i<b.length; i++) {
			
			for(int j=i+1; j<b.length; j++) {
				
				if(b[i]>b[j]) {
					
					int tem=b[i];
					b[i] =b[j];
					b[j]=tem;
					
				}
			}
			
		}
		System.out.println(b[0]);

		//method02
		
		int min=b[0];
		
		for(int i=1; i<b.length; i++) {
			
			if(b[i]<min) {
				min=b[i];
			}
		}
		System.out.println("Minimum value "+min);
		
		// method 03
		
		
		Arrays.sort(b);
		int mini=b[0];
		System.out.println(mini);
	}

}
