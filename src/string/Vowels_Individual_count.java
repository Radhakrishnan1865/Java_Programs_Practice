package string;

public class Vowels_Individual_count {

	public static void main(String[] args) {
		
		String s=" Hello Good Morning";
		s=s.replaceAll(" ", "");
		String s1= s.toLowerCase();
		
		int aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;
		for(int i=0; i<s1.length(); i++) {
			
			char c= s1.charAt(i);
			
			switch(c) {
			
			case 'a': aCount++;break;
			case 'e': eCount++;break;
			case 'i': iCount++;break;
			case 'o': oCount++;break;
			case 'u': uCount++;break;
			default:break;
			}
		}
		System.out.println("a Count is :"+ aCount+"-times");
		System.out.println("e Count is :"+ eCount+"-times");
		System.out.println("i Count is :"+ iCount+"-times");
		System.out.println("o Count is :"+ oCount+"-times");
		System.out.println("u Count is :"+ uCount+"-times");
		

	}

}
