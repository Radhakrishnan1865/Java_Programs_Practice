package string;

public class ReverseString {

	public static void main(String[] args) {
		// Example 01
		// using string buffer method
		
		String name= "Radha";
		
		StringBuffer string= new StringBuffer(name);
		//StringBuffer sb = new StringBuffer(String.valueOf(name)); // another method 
        StringBuffer rev=string.reverse();
		System.out.println(rev);
		
		// Example 02
		// using string concatenation operator ( length(), charAt() )
		
		String name1= "RADHA krishnan A";
		String rev1="";
		 int len=name1.length();
		 
		 for(int i=len-1; i>=0; i--) {
			 rev1 = rev1 + name1.charAt(i);
		 }
		 System.out.println(rev1);
		 
		 // Example 03
		 // using character array
		 
		 String str="RADHA";
		 String reverse="";
		  char a[]=str.toCharArray();
		  int n= a.length;
		  for(int i=n-1; i>=0; i--) {
			  reverse=reverse+a[i];
		  }
		  System.out.println(reverse);
		  
		  // Example 04
		  // Using string builder method
		  
		  str="RADHA";
		  StringBuilder s= new StringBuilder(str);
		  //StringBuilder s= new StringBuilder(); // another method
		 // s.append(str);
		  StringBuilder re=s.reverse();
		  System.out.println(re);

		  // methood 05
		  
		  String m="krishnan";
		  
		  String o="";
		  
		  for(int i=0; i<m.length(); i++) {
			  
			  o=m.charAt(i)+o;
		  }
		  System.out.println("Reverse a string " +o);
	}

}
