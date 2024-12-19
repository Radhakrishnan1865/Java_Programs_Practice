package string;


import java.util.LinkedHashSet;
import java.util.Set;

public class Reverse_Word_Remove_Duplicate {

	public static void main(String[] args) {
		
		String str="Radha Love Love Karma";
		
		String[] s=str.split(" ");
		Set<String> set= new LinkedHashSet<String>();
		for(String a: s) {
		set.add(a);
		}
		String reverse="";
		for(String b:set) {
			
			String rev="";
			
			for(int j=b.length()-1; j>=0; j--) {
				
				rev+=b.charAt(j);
			}
			
			reverse+=rev+ " ";
			
			}
		
		System.out.println(reverse);
	}
}
