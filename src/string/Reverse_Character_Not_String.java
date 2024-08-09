package string;

public class Reverse_Character_Not_String {

	public static void main(String[] args) {
		
		String s="Welcome To Home";
		
		String[] words=s.split(" ");
		String output="";
		for(String word:words) {
			String rev="";
			
			for(int i=word.length()-1; i>=0; i--) {
				
				rev=rev+word.charAt(i);
			}
			output=output+rev+ " ";
		}
		System.out.println(output);//emocleW oT emoH 

	}

}
