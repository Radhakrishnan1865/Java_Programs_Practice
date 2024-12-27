package string;

public class Extract_Word_From_String {


	public static void main(String[] args) {
		
		String str="We work every day to support our clients’"
				+ " growth in the era of AI and to deliver mission-critical operations at "
				+ "scale with security, reliability, performance and compliance";
		
		int startingIndex=str.indexOf("performance and compliance");
		int endingIndex=startingIndex+"performance and compliance".length();
		
		String result=str.substring(startingIndex,endingIndex);
		System.out.println(result);
	}
}
