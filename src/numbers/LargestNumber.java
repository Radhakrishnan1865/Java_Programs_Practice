package numbers;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// Largest of two number using if ..else condition
		
		
		//Example 01
		
		int a=16;
		int b=12;
		
		if(a>b) {
			System.out.println(" a is largest number");
		}
		else {
			System.out.println(" b is largest number");
		}
		
		//Example 02
		// find largest number using ternary operator
		
		int x=8;
		int y=11;
		
		int result= (x>y)?x:y;
		
		System.out.println("Largest number is : " + result);
		
		
		//  Example 03
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter a first number :");
		int m=sc.nextInt();
		
		System.out.println(" Enter a second number :");
		int n=sc.nextInt();
		
		System.out.println(" Enter a third number :");
		int o=sc.nextInt();
		
		if(m>n && m>o) {
			
			System.out.println(m + " is a largest number");
		}
		else if(n>m && n>o) {
			System.out.println(n + " is a largest number");
			
		}
		else {
			System.out.println(o + " is a largest number");
		}
		
		// Example 04
		// using ternary operator
		// approach 01
		
		a=10;
		b=20;
		int c=30;
		
		int largest1= (a>b)?a:b;
		int largest2=(c>largest1)?c:largest1;
		
		System.out.println(largest2 + " is a largest number");
		
		// approach 02
		
		a=10;
		b=20;
	    c=30;
	    
	    int largest=(c>((a>b)?a:b)?c:(a>b)?a:b);
		System.out.println(largest + " is a largest number");

	}

}
