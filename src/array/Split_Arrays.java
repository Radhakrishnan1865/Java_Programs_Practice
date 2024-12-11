package array;

import java.util.Arrays;

public class Split_Arrays {

	public static void main(String[] args) {
		   int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        
		        // Split into rows
		        for (int i = 0; i < matrix.length; i++) {
		            System.out.print("Row " + (i + 1) + ": ");
		            for (int j = 0; j < matrix[i].length; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		        
		        System.out.println();
		        
		        // Split into columns
		        for (int j = 0; j < matrix[0].length; j++) {
		            System.out.print("Column " + (j + 1) + ": ");
		            for (int i = 0; i < matrix.length; i++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		        
		       

		        	int []a={2,4,8,9,1};

		        	Arrays.sort(a);
		        	int large=a[a.length-1];
		        	System.out.println(large);

		    }

}
