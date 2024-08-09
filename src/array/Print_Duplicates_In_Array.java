package array;

import java.util.HashSet;

public class Print_Duplicates_In_Array {

	public static void main(String[] args) {
		
		int[]ar= {3,6,5,9,2,5,3,2};
		
		//Approach01
		for(int i=0; i<ar.length; i++) {
			
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[i]);
				}
				
			}
		}

		//Approach02
		String[]s= {"java","selenium","python","bdd","javA","Java"};
		boolean flag=false;
		HashSet<String> hs=new HashSet<String>();
		
		for(String a:s) {
			
			if(hs.add(a)==false) {
				System.out.println("Found duplicate elements: "+ a);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Duplicate elements not found");
	}

}
