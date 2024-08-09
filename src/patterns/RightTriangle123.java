package patterns;

public class RightTriangle123 {

	public static void main(String[] args) {
		
		int row=5;
		for(int i=0; i<row; i++)
		{
			int p=1;
			for(int j=0; j<=i; j++)
			{
				System.out.print(p++);
			}
			System.out.println();
			}

	}

}
