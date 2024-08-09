package numbers;

public class PrintNumbers_Only {

	public static void main(String[] args) {
		
		String s="radhakrishnanof1995";
		String s1="";
		
		char[]c= s.toCharArray();
		for(int i=0; i<c.length; i++) {
			
			char ch= c[i];
			if(ch>='0' && ch<='9') {
				s1=s1+ch;
			}
		}

		System.out.println(s1);
	}

}
