package numbers;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		// Example 01
		// swapping two numbers using + and - operators
		
		int x=18;
		int y=27;
		
		
		System.out.println("Before swappinng ");
		System.out.println("x value is : "+ x);
		System.out.println("y value is : "+ y);
		
		x= x+y;
		
		y= x-y;
		x= x-y;
		
		System.out.println("After swappinng ");
		System.out.println("x value is : "+ x);
		System.out.println("y value is : "+ y);
		System.out.println("----------------");
		
		// Example 02
		// using * and / operators
		// here the values are should not be zero
		
		int a=10;
		int b=20;
		
		System.out.println("Before swappinng ");
		System.out.println("a value is : "+ a);
		System.out.println("b value is : "+ b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swappinng ");
		System.out.println("a value is : "+ a);
		System.out.println("b value is : "+ b);
		System.out.println("----------------");
		
		// Example 03
		// using third variables
		
		int m=20;
		int n=30;
		System.out.println("Before swappinng ");
		System.out.println("m value is : "+ m);
		System.out.println("n value is : "+ n);
		
		int t=m;
		m=n;
		n=t;
		System.out.println("After swappinng ");
		System.out.println("m value is : "+ m);
		System.out.println("n value is : "+ n);
		System.out.println("----------------");
		
		// Example 04
		// using bitwise XOR operator
		
		int c=40;
		int d=50;
		System.out.println("Before swappinng ");
		System.out.println("c value is : "+ c);
		System.out.println("d value is : "+ d);
		c=c^d;
		d=c^d;
		c=c^d;
		System.out.println("After swappinng ");
		System.out.println("c value is : "+ c);
		System.out.println("d value is : "+ d);
		System.out.println("----------------");
		
		// Example 05
		// using single statement
		
		int e=100;
		int f=200;
		System.out.println("Before swappinng ");
		System.out.println("e value is : "+ e);
		System.out.println("f value is : "+ f);
		
		f=e+f-(e=f);
		System.out.println("After swappinng ");
		System.out.println("e value is : "+ e);
		System.out.println("f value is : "+ f);
		System.out.println("----------------");
		

	}

}
