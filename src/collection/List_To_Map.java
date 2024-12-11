package collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List_To_Map {

	public static void main(String[] args) {
        // Input List
        List<String> list = Arrays.asList("1=Geeks", "2=for", "3=Geeks");

        // Create an empty Map
        Map<Integer, String> map = new HashMap<>();

        // Iterate through the list and populate the map
        for (String entry : list) {
            String[] parts = entry.split("="); // Split the string into key and value
            int key = Integer.parseInt(parts[0]); // Convert key to Integer
            String value = parts[1]; // Extract the value
            map.put(key, value); // Add to the map
        }

        // Print the resulting Map
        System.out.println("Map: " + map);
    }

}
