package array;

public class SumOfArray_Even_Odd {

	public static void main(String[] args) {
		
		int []a= {3,5,8,4,10,9,23,24,60};
		int odd_count=0;
		int even_count=0;
		int odd_sum=0;
		int even_sum=0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i]%2==0) {
				even_sum+=a[i];
				even_count++;
				
			}else
				odd_sum+=a[i];
			odd_count++;
			
		}

		System.out.println("Sum of odd numbers "+ odd_sum);
		System.out.println("Sum of even numbers "+ even_sum);
		
		System.out.println("Odd numbers Count "+ odd_count);
		System.out.println("Even numbers Count"+ even_count);
	}

}
