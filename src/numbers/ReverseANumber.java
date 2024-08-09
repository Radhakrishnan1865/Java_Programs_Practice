package numbers;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		
		
		
		// Example 01
				// using algorithm/operators
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a number : ");
		int number=scanner.nextInt();
		
		   int rev=0;
		 while(number>0) {
			 
			 rev=rev*10+ number%10;
			 number=number/10;
		 }
		 
		 System.out.println(rev);
		 
		 System.out.println("--------------------------");
		 
		 // Example 02
		 // using string buffer method
		 
			Scanner scanner1 = new Scanner(System.in);
			System.out.println(" Enter a number : ");
			int number1=scanner1.nextInt();
		 
		 
		 StringBuffer sb = new StringBuffer(String.valueOf(number1));
		 StringBuffer reverse=sb.reverse();
		 
		 System.out.println(reverse);
		 
		 
		 // Example 03 
		 // using string builder method
		 
		 Scanner scanner2 = new Scanner(System.in);
			System.out.println(" Enter a number : ");
			int number2=scanner1.nextInt();
			
			StringBuilder sb1 = new StringBuilder();
			sb1.append(number2);
			StringBuilder reverse1=sb1.reverse();
			
			System.out.println(reverse1);
		 
		 // Example 04
		 // Using algorithms
		 
		 Scanner sc = new Scanner(System.in);
			System.out.println(" Enter a number : ");
			int num=sc.nextInt();
			
			while(num>0) {
				
				int result= num%10;
				System.out.print(result);
				num=num/10;
			}

	}

}
