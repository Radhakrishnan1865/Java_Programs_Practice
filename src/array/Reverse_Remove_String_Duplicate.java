package array;


import java.util.LinkedHashSet;
import java.util.Set;

public class Reverse_Remove_String_Duplicate {

	
	public static void main(String[] args) {
		
		//int []ar= {10,40,10,10,10,10};
		String ar= "Radha Love Love Karma";
		String[] str=ar.split(" ");
		
		Set<String> s= new LinkedHashSet<String>();
		
		for(int i=0; i<str.length; i++) {
			
			  s.add(str[i]);
		}
	String reverse="";
		for(String a:s) {
			
			String re=a.substring(0,a.length()-1).toLowerCase()+a.substring(a.length()-1).toUpperCase();
			String rev="";
			for(int j=re.length()-1;j>=0;j--) {
				
				rev+=re.charAt(j);
			}
			reverse+=rev+" ";
		}
		
		
		System.out.println(reverse);
		
		
	}

}
