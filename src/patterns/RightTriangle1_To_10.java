package patterns;

public class RightTriangle1_To_10 {

	public static void main(String[] args) {
		
		int row=4;
		int n=1;
		for(int i=0; i<row; i++)
		{
			//int p=1;
			for(int j=0; j<=i; j++)
			{
				System.out.print(n++);
			}
			System.out.println();
			}

	}

}
