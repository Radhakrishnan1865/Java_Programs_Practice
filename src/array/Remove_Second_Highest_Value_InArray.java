package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Remove_Second_Highest_Value_InArray {

	public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 5, 5, 5};  // Example array
        System.out.println("Original array: " + Arrays.toString(arr));
        
        int[] result = removeSecondHighest(arr);
        
        if (result != null) {
            System.out.println("Array after removing the second highest value: " + Arrays.toString(result));
        } else {
            System.out.println("Array has fewer than 2 distinct values or is empty.");
        }
    }
    
    public static int[] removeSecondHighest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }
        
        // Find the highest and second highest values
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }
        
        // If there is no valid second highest value
        if (secondHighest == Integer.MIN_VALUE) {
            return null;
        }
        
        // Create a new array without the second highest value
        int count = 0;
        for (int num : arr) {
            if (num != secondHighest) {
                count++;
            }
        }
        
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != secondHighest) {
                result[index++] = num;
            }
        }
        
        return result;
    }
}
