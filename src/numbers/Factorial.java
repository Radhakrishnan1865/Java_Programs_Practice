package numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int number=sc.nextInt();
		long fact=1;
		// Ascending order
		/*
		for(int i=1; i<=number; i++) {
			fact=fact*i;
			
		}
		System.out.println(fact);
		
		// Descending order
		
		for(int i=number; i>0; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		*/
		
		
		// using while loop
		
		while(number>0) {
			fact=fact*number;
			number--;
		}
		System.out.println(fact);

	}

}
