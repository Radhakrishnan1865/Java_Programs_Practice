package asssignmentPrograms;

public class RemoveJunkOrSpecialCharacters {

	public static void main(String[] args) {
		
		String s="13120dkoe08e0r882r!£%$£^%&**&(JHFty^%%£$^&^&jJHJBK";
		s=s.replaceAll("[^a-z0-9]", "");// [^ a-zA-Z0-9] - this syntax is used for other than this character removed.
		System.out.println(s);

	}

}
