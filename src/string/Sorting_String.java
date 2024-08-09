package string;

import java.util.Arrays;

public class Sorting_String {

	public static void main(String[] args) {


		// without using sort method
		String s="RADHAKRISHNAN";
		
		char []ch=s.toCharArray();
		char temp;
		for(int i=0; i<ch.length;i++) {
			
			for(int j=i+1; j<ch.length; j++) {
				
				if(ch[i]>ch[j]) {
					
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}

		System.out.println(ch);// OutPut : AAADHHIKNNRRS
		
		// default method
		
		String str="KANNAN";
		
		char[]c=str.toCharArray();
		Arrays.sort(c);
		
		System.out.println(c);
	}

}
