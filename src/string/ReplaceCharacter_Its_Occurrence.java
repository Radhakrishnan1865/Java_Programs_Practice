package string;



public class ReplaceCharacter_Its_Occurrence {

	public static void main(String[] args) {
		
		String s= "automation testing Using java selenium and cucumber with integration of junit";
		
		char occurrence='a';
		
		if(s.indexOf(occurrence)==-1) {
			System.out.println("Given character is Not available in the String");
			System.exit(0);
		}
		int count=1;
		
		for(int i=0; i<s.length(); i++) {
			
		char c=s.charAt(i);
			if(c==occurrence) {
			s=s.replaceFirst(String.valueOf(occurrence), String.valueOf(count));
			count++;
			}
		}

		System.out.println(s);// out put : 1utom2tion testing Using j3v4 selenium 5nd cucumber with integr6tion of junit
	}

}
