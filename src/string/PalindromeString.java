package string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your string");
		String name=sc.nextLine();
		
		String str=name;
		String rev="";
		for(int i=name.length()-1; i>=0; i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println(" your string is a palindrome string");
		}
		else {
			System.out.println(" your string is a not palindrome string");

		}

	}

}
