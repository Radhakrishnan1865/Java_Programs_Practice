package array;

public class Linear_search_Array {

	public static void main(String[] args) {
		
		int []a= {2,3,4,5,6,7};
		
		int key=5;
		boolean flag=false;
		for(int s:a) {
			if(s==key) {
				
				System.out.println("Element found.."+ s);
				flag=true;
				break;
			}
		}

		if(flag==false)
		System.out.println("Element not found...");
	}

}
