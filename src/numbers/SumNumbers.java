package numbers;

public class SumNumbers {

	public static void main(String[] args) {
		
		// method 01
		int num=35238695;
		int even_sum=0;
		int odd_sum=0;
		
		while(num>0) {
			
			int rem= num%10;
			
			if(rem%2==0) {
				even_sum+=rem;
			}
			else {
				odd_sum+=rem;
			}
			num/=10;
		}
		
		System.out.println(" sum of even number is : " + even_sum);
		System.out.println(" sum of odd number is : " + odd_sum);

		System.out.println("-------------------------");
		// method 02
		// print odd and even sum 1 to 70
		
		int odd_sum1=0;
		int even_sum1=0;
		for(int i=0; i<70; i++) {
			
			if(i%2==0) {
			odd_sum1+=i;
			}
			else {
				even_sum1+=i;
			}
		}
		
		System.out.println("Sum of odd numbers " +odd_sum1);
		System.out.println("Sum of even numbers " +even_sum1);
	}

}
