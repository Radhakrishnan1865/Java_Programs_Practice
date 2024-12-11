package string;

public class Reverse_String_UpperAndLowerCase {

	public static void main(String[] args) {
		
String str="Great Power";
		
		String[]s=str.toLowerCase().split(" ");
		String b="";
	
		//StringBuilder sb=new StringBuilder();
		for(String a:s) {
			if(a.length()>0) {
				
				String first=a.substring(0,1).toLowerCase();
				String remaining=a.substring(1).toUpperCase();
				
				//sb.append(first).append(remaining).append(" ");
				 b=b.concat(first).concat(remaining).concat(" ");
			}
			
		}
		System.out.println(b);

	}

}
