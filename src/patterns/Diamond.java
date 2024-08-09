package patterns;

public class Diamond {

	public static void main(String[] args) {


		int i,j,row=5;

		for(i=0; i<row-1; i++) {

			for(j=i; j<row; j++) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(i=0; i<row; i++) {

			for(j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(j=i; j<row-1; j++) {
				System.out.print("*");
			}
			for(j=i; j<row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
