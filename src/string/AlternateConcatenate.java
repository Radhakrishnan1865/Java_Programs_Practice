package string;

public class AlternateConcatenate {

public static void main(String[] args) {
		
		String s1="java";
		String s2="SELENIUM";
		String s3="Radha";
		StringBuilder builder=new StringBuilder();
		int maxLength=Math.max(s1.length(), s2.length());
		for (int i=0; i<maxLength; i++) {
			
			if(i<s1.length()) {
				builder.append(s1.charAt(i));
			}
			if(i<s2.length()) {
				builder.append(s2.charAt(i));
			}
			if(i<s3.length()) {
				builder.append(s3.charAt(i));
			}
		}

		System.out.println(builder);
	}
}
