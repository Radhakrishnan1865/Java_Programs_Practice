package array;

public class MissingNumber_Array {

	public static void main(String[] args) {

		int []a= {1,2,4,5,6,3,8};


		int sum1=0;
		for(int i=0; i<a.length; i++) {

			sum1=sum1+a[i];
		}
		System.out.println(sum1);

		int sum2=0;
		for(int i=1; i<=8; i++) {

			sum2+=i;
		}
		System.out.println(sum2);

		int missingNumber=sum2-sum1;

		System.out.println("Missing Number in array "+missingNumber);

	}

}
