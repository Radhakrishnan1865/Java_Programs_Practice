package array;

public class EvenAndOddInArray {

	public static void main(String[] args) {
		// Print even and odd number present in array
		
		int a[]= {2,3,4,5,6,7};
		int even=0;
		int odd=0;
		
		for(int x:a) {
			
			if(x%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		System.out.println("------------------");
		
		
		// print sum of even and odd number
		
		int even_sum=0;
		int odd_sum=0;
		
		for(int y:a) {
			
			if(y%2==0) {
				
				even_sum+=y;
			}
			else {
				odd_sum+=y;
			}
		}
		System.out.println(even_sum);
		System.out.println(odd_sum);

	}

}
