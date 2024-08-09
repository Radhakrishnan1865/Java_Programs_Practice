package patterns;

public class InverseTriangle {

	public static void main(String[] args) {


		int row=5;
		int i,j;
		
		for(i=0; i<row; i++) {
			
			for(j=0; j<i; j++) {
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
