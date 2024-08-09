package array;

import java.util.Arrays;

public class Compare_Arrays {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5};
		int[]b= {1,2,3,4,5};
		
		// method 01
	boolean status=Arrays.equals(a,b);
	
	if(status==true) {
		System.out.println("Arrays are equal");
	}
	else
		System.out.println("Arrays are not equal");

	
	// method 02
	
	boolean status1=true;
	
	if(a.length==b.length) {
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]!=b[i]) {
				
				status1=false;
			}
			
		}
	}
	else
		status1=false;
	
	if(status1==true)
		System.out.println("Arrays are equal");
	else
		System.out.println("Arrays are not equal");
	
	}

}
