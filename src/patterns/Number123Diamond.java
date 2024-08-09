package patterns;

public class Number123Diamond {

	public static void main(String[] args) {


		int i,j,row=5;

		for(i=0; i<row-1; i++) {
			int p=1;

			for(j=i; j<row; j++) {
				System.out.print(" ");
			}
			for(j=0; j<=i; j++) {
				System.out.print(p++);
			}
			for(j=0; j<i; j++) {
				System.out.print(p++);
			}
			System.out.println();
		}

		for(i=0; i<row; i++) {
			int p1=1;

			for(j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(j=i; j<row-1; j++) {
				System.out.print(p1++);
			}
			for(j=i; j<row; j++) {
				System.out.print(p1++);
			}
			System.out.println();
		}
		
		
	}

}
