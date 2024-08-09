package patterns;

public class LeftTrianglePattern {


	int row=5;

	public void m2() {

		// Upward triangle

		for(int i=0; i<row; i++) {

			for(int j=i; j<row-1; j++) {
				System.out.print(" ");
			}
			for(int a=0; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}


		// Downward triangle

		for(int i=0; i<row; i++) {

			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int a=i; a<row-1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		LeftTrianglePattern ltp=new LeftTrianglePattern();
		ltp.m2();
	}

}
