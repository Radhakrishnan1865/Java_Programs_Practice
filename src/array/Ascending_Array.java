package array;

import java.util.Arrays;

public class Ascending_Array {

	public static void main(String[] args) {
	
		int []b= {400,300,900,100,500,800};



		System.out.println("Ascending Array :");
		//method 01
		for(int i=0; i<b.length; i++) {
			
			for(int j=i+1; j<b.length; j++) {
				
				if(b[i]>b[j]) {
					
					int tem=b[i];
					b[i] =b[j];
					b[j]=tem;
					
				}
			}
			System.out.println(b[i]);
		}
		
		
		//method 02
		
		Arrays.sort(b);
	String s=Arrays.toString(b);
	System.out.println(s);
	}

}
