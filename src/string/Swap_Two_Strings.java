package string;

public class Swap_Two_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Radha";
		String s2="Krishnan";
		
		
		System.out.println("Before swapping s1 is: " +s1 );
		System.out.println("Before swapping s2 is: " +s2 );
		
		s1=s1.concat(s2);
		
		s2=s1.substring(0,s1.length()-s2.length());
		
		s1=s1.substring(s2.length());
		
		
		System.out.println("After swapping s1 is: " +s1 );
		System.out.println("After swapping s2 is: " +s2 );

	}

}
