package patterns;

public class RightTriangle111 {

	public static void main(String[] args) {
		
		int row=5;
		for(int i=0,p=1; i<row; i++,p++)
		{
			
			for(int j=0; j<=i; j++)
			{
				System.out.print(p);
			}
			System.out.println();
			}

	}

}
