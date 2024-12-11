package array;

public class Move_Zeros {

	public static void main(String[] args) {
		
		int[]arr= {1,0,2,0,3};
	
		int n=arr.length;
		int nonZeroIndex=0;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i]!=0) {
				arr[nonZeroIndex++]=arr[i];
				
			}
		}
		
		while(nonZeroIndex<n) {
			arr[nonZeroIndex++]=0;
		}
		
		for(int num:arr) {
			System.out.print(num);
		}
	}
}
