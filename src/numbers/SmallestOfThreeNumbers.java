package numbers;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		// find smallest of three numbers using if..else condition
		
		int a=4;
		int b=9;
		int c=2;
		
		if(a<b && a<c) {
			System.out.println(" a is smallest number");
		}
		else if(b<a && b<c) {
			System.out.println(" b is smallest number");
		}
		else {
			System.out.println(" c is smallest number");
		}
	}

}
