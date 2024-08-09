package numbers;

public class CountANumber {

	public static void main(String[] args) {
		// count number of digits in a number
		
		int a=83436287;
		int count=0;
		
		while(a>0) {
			a/=10;
			
			count++;
			
		}
		System.out.println(count + " Digits in a given number");

	}

}

