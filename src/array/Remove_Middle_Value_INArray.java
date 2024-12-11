package array;

public class Remove_Middle_Value_INArray {

public static void main(String[] args) {
		
		int[]array= {1,2,3,4,5,6,7};
		
		int length=array.length/2;
		
		int[]newArray=new int[array.length-1];
		
		for(int i=0, j=0; i<array.length; i++) {
			
			if(i !=length) {
				
				newArray[j++]=array[i];
			}
		}
		
		for(int arr:newArray) {
			
		System.out.print(arr+ ",");
		}
	}
}
