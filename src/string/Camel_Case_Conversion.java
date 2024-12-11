package string;

public class Camel_Case_Conversion {

	public static void main(String[] args) {
		
		String str="Chennai hyderabad kerala";
		String []s=str.trim().split(" ");
		
		StringBuilder sb=new StringBuilder();
		for(String s1:s) {
			
			sb.append(Character.toUpperCase(s1.charAt(0)))
			.append(s1.substring(1).toLowerCase());
		}

		System.out.println(sb.toString());
	}

}
