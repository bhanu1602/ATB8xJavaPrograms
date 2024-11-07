package Oct.ex_281024and301024.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab165 {

    // Iterating over Map

    /*
    Notes:
    - `Map` iteration can be performed in different ways. Here, we demonstrate:
        - **Method 1**: Enhanced `for` loop with `Map.Entry<K, V>` for accessing key-value pairs.
        - **Method 2**: Using `keySet()` to iterate over keys and fetch values.
        - **Method 3**: Directly iterating over values using `values()` when only values are needed.

    - **Best Practice**: Using generics (`Map.Entry<String, String>`) avoids `ClassCastException`.
    - **Map Iteration Approaches**:
        - `entrySet()`: Provides a set of `Map.Entry` elements for accessing both keys and values.
        - `keySet()`: Allows iteration over keys, with values accessed using `get(key)`.
        - `values()`: Directly iterates over values without needing keys.
    */

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name", "Bob");
        map.put("age", "25");
        map.put("city", "New York");
        System.out.println("Map contents: " + map);

        // Method 1: Iterating using entrySet() with generics for both keys and values
        System.out.println("\nMethod 1: Using entrySet()");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Method 2: Iterating using keySet() to access keys and then fetching values with get(key)
        System.out.println("\nMethod 2: Using keySet()");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Method 3: Iterating over values directly using values()
        System.out.println("\nMethod 3: Using values()");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}


