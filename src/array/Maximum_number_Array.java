package array;

import java.util.Arrays;

public class Maximum_number_Array {

	public static void main(String[] args) {
		

		int []b= {400,300,900,100,500,800};

		
		// method01
		for(int i=0; i<b.length; i++) {
			
			for(int j=i+1; j<b.length; j++) {
				
				if(b[i]<b[j]) {
					
					int tem=b[i];
					b[i] =b[j];
					b[j]=tem;
					
				}
			}
			
		}
		System.out.println(b[0]);
		
		//method02
		
		int max=b[0];
		for(int i=1; i<b.length; i++) {
			
			if(b[i]>max) {
				max=b[i];
			}
		}

		System.out.println("Maximum value "+ max);
		
		// method 03
		
		int []c= {2,4,5,6,9,7};
		
		Arrays.sort(c);
		int large=c[c.length-1];
		System.out.println("Largest number in array: "+ large);
	}

}
