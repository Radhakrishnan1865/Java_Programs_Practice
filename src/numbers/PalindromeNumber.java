package numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// print palindrome number using conditional and looping statement
		// A polindrome number is a number that remains the same when its digits are reversed.
		
		// Approach 01
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a number");
		int number=sc.nextInt();
		int temp=number;
		int rev=0;
		
		while(number>0) {
			
			rev=rev*10+number%10;
			number=number/10;
		}
		if(temp==rev) {
			System.out.println(" Given number is a palindrome number");
		}
		else {
			System.out.println(" Given number is a not palindrome number");
		}
		
		
		// Approach 02
		
		Scanner scanner= new Scanner(System.in);
		System.out.println(" Enter a number");
		int num=sc.nextInt();
		int result=num;
		int reverse=0;
		
		while(num>0) {
			
			 reverse=num%10;
			 System.out.print(reverse);
			 num=num/10;
		}
		
		if(reverse==result) {
			System.out.println(" Given number is a palindrome number");
		}
		else {
			System.out.println(" Given number is a not palindrome number");
		}

	}

}
