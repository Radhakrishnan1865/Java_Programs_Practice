package string;

public class Panagram {

	
	public static void main(String[] args) {
		
		String s="We can group the bulk of  testcases and then we can "
				+ "skip or execute the testcases by using the group name";
		String s1=s.replaceAll(" ", "");
		
		int length= s1.length();
		int len=s.length();
		
		System.out.println(len);
		System.out.println(length);
		
		if(len<26) {


			System.out.println("not a panagram");
		}
	}
}
