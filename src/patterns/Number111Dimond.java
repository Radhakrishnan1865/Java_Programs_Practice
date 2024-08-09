package patterns;

public class Number111Dimond {

	public static void main(String[] args) {


		int j,row=5;

		for(int i=0,p1=1;i<row-1; i++,p1++) {
			//int p=1;

			for(j=i; j<row; j++) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print(p1);
			}
			for(j=0; j<i; j++) {
				System.out.print(p1);
			}
			System.out.println();
		}

		for(int i=0,p2=row; i<row; i++,p2--) {
			//int p1=1;

			for(j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(j=i; j<row-1; j++) {
				System.out.print(p2);
			}
			for(j=i; j<row; j++) {
				System.out.print(p2);
			}
			System.out.println();
		}
		

	}

}
