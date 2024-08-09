package numbers;

public class CountNumberEvenAndOdd {

	public static void main(String[] args) {
		int number=4567238;
		int even_count=0;
		int odd_count=0;
		
		while(number>0) {
			int rem=number%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			
			number=number/10;
		}
		System.out.println(" count for even number :" + even_count);
		System.out.println(" count for odd number :" + odd_count);

	}

}
