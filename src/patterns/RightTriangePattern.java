package patterns;

public class RightTriangePattern {
	int row=5;
	public void m1()
	{
		// Upward triangle
		
	for(int i=0; i<row; i++)
	{
		
		for(int j=0; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
	// Downward triangle
		
	for(int i=0; i<row; i++)
	{
		
		for(int j=row; j>i; j--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	
	}
	public static void main(String[] args) {
		
		RightTriangePattern trp=new RightTriangePattern();
		trp.m1();
		
	

	}

}
