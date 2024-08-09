package string;

public class Count_Number_Character {

	public static void main(String[] args) {
		
		String s= "RADHAKRISHNAN A";
		String s1= s.replaceAll(" ", "");
		int len= s1.length();
		System.out.println(len);
		
		char []s2=s1.toCharArray();
		System.out.println(s2.length);

	}

}
