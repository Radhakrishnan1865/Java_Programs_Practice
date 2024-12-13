package string;

import java.util.Map;
import java.util.TreeMap;

public class Reorder_String {

	
	    public static void main(String[] args) {
	        String input = "Prooggraming";
	        String result = reorderString(input);
	        System.out.println(result);
	    }

	    public static String reorderString(String input) {
	        // Convert the input string to lowercase to group similar characters case-insensitively
	        input = input.toLowerCase();

	        // Create a TreeMap to store character frequencies (sorted by character)
	        TreeMap<Character, Integer> charFrequency = new TreeMap<>();

	        // Calculate the frequency of each character
	        for (char c : input.toCharArray()) {
	            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
	        }

	        // Build the output string based on frequency and sorted order
	        StringBuilder output = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
	            char character = entry.getKey();
	            int frequency = entry.getValue();
	            for (int i = 0; i < frequency; i++) {
	                output.append(character);
	            }
	        }

	        return output.toString();
	    }
	}

