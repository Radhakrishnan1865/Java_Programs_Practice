package numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//int number=153;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int temp=number;
		int arm=0;
		
		while(number>0) {
			
			int n=number%10;
			arm= arm+ (n*n*n);
			number/=10;
			
		}
		if(temp==arm) {
			System.out.println(" Given number is armstrong number");
		}
		else {
			System.out.println(" Given number is not a armstrong number");
		}

	}

}
