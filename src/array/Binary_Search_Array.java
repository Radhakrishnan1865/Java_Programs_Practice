package array;

import java.util.Arrays;

public class Binary_Search_Array {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,9,6,7,8};

		//method 01
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int key=7;
		int l=0;
		int h=a.length-1;

		boolean flag=false;
		while(l<=h) {

			int mid=(l+h)/2;

			if(a[mid]==key) {

				System.out.println("Element Found..."+mid);
				flag=true;
				break;
			}
			if(a[mid]<key){

				l=mid+1;
			}
			if(a[mid]>key) {

				h=mid-1;
			}

		}
		if(flag==false)
			System.out.println("Element not found");

		// method 02 - default mathod
		
		int b[]= {1,2,3,4,5,6,9,8,7};
		
		Arrays.sort(b);
		Arrays.toString(b);
		
		int find_Number= Arrays.binarySearch(b,6);
		
		System.out.println("Element found: "+ find_Number);
	}

}
