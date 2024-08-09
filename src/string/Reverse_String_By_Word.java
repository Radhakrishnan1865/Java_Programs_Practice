package string;

public class Reverse_String_By_Word {

	public static void main(String[] args) {


		
		String input= "Automation testing Java Selenium";
		
		String[] words= input.split(" ");
		
		for(int i=words.length-1; i>=0; i--) {
			
			System.out.print(words[i] + " ");//Selenium Java testing Automation 
			
		}
		
	}

}
