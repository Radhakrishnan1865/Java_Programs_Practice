package string;

public class Alternate_Concatenate {

	public static void main(String[] args) {


		String s1="radha";
		String s2="KRISHNAN";
		
		int maxLength=Math.max(s1.length(), s2.length());
		StringBuilder builder=new StringBuilder();
		
		for(int i=0; i<maxLength; i++) {
			
			if(i<s1.length()) {
				builder.append(s1.charAt(i));
			}
			if(i<s2.length()) {
				builder.append(s2.charAt(i));
			}
		}

		System.out.println(builder);
	}

}
