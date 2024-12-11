package array;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElements_In_Array {


	public static void main(String[] args) {
       
		
		 // Example array with duplicate values
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Create a HashSet to store unique values
        Set<Integer> uniqueValues = new HashSet<>();

        // Add each element of the array to the HashSet
        for (int value : array) {
            uniqueValues.add(value);
        }

        // Optionally, convert HashSet to an array if needed
        Integer[] uniqueArray = uniqueValues.toArray(new Integer[0]);

        // Print the unique values
        System.out.println("Unique values:");
        for (int value : uniqueArray) {
            System.out.println(value);
        }
		/*int[] array = { 1,2,4,3,1,2}; // Example array
        
        int uniqueValue = findUnique(array);
        
        System.out.println("The unique value in the array is: " + uniqueValue);
    }
    
    public static int findUnique(int[] arr) {
        // Initialize a map to count occurrences of each element
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count occurrences of each element in the array
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the element with count 1 (unique element)
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        
        // If no unique element found, you can return a default value or throw an exception
        throw new RuntimeException("No unique element found");
        */
	}
}
