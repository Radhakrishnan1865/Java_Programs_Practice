package string;

public class FirstLetter_Capital {

	public static void main(String[] args) {
		
		String s="welcome to our country";
		String s1="";
		String[]s2= s.split(" ");
		for (String s3 : s2) {
			char a= s3.charAt(0);
		char b=	Character.toUpperCase(a);
		String c=s3.substring(1);
		s1=s1+b+c+ " ";
		}

		System.out.println(s1);
	}

}
