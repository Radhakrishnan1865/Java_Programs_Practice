package asssignmentPrograms;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		
		
		String s= "RA DH  A KR    ISH NA   N";
		System.out.println("Before removing spaces : " + s);
		
		s=s.replaceAll("\\s", ""); // - "\\s" - its indicate spaces
		System.out.println("After removing spaces : " + s);
		
		
	}

}
