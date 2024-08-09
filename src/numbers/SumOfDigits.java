package numbers;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int a=857395;
		int sum=0;
		
		while(a>0) {
			
			int rem=a%10;
			sum+=rem;
			a/=10;
		}
		System.out.println(" sum of given number is :" + sum);
	}

}
