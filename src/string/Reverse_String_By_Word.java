package string;

public class Reverse_String_By_Word {

	public static void main(String[] args) {


		
		String input= "Automation testing Java Selenium";
		
		String[] words= input.split(" ");
		String rev="";
		for(int i=words.length-1; i>=0; i--) {
			
			String reverse="";
			String s=words[i];
			char[]ch=s.toCharArray();
			System.out.print(s+ " ");//Selenium Java testing Automation 
			
			for(int j=ch.length-1; j>=0; j--) {
				
				reverse=reverse+ch[j];
			}
			//System.out.println(reverse);
			rev=rev+reverse+ " ";
		}
		System.out.println();
		System.out.println(rev);//muineleS avaJ gnitset noitamotuA 
	}

}
