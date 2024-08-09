package string;

public class Compare_Two_String {

	public static void main(String[] args) {
		
		String s1="Radha";
		String s2="Rakki";
		String s="Rakki";
		boolean bo=false;
		
		// method 01
		
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i)!=s2.charAt(i)) {
				bo= false;
				//System.out.println("Strings are not equal");
				break;
			}
			bo= true;
			//System.out.println("Strings are equal");
		}
			System.out.println(bo);
	
			// method 02
			
			boolean result=s2.equals(s);
			System.out.println(result);
			
			
	}

}
