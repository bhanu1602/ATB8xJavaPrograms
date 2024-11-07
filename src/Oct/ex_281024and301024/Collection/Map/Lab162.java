package Oct.ex_281024and301024.Collection.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab162 {

    // Working with Map Interface and Implementations

    /*
    Notes:
    - **Map Interface**:
        - A `Map` represents a collection of key-value pairs, where each key is unique.
        - The `Map` interface is part of the `java.util` package but is not a subtype of the `Collection` interface.
        - Common use cases for a `Map` include:
            - Mapping error codes to descriptions.
            - Associating zip codes with city names.
            - Linking managers (keys) with lists of their employees (values).
            - Mapping classes to students in a school system.

    - **Types of Map Implementations**:
        1. **HashMap**:
            - Does not maintain any order of keys.
            - Allows one `null` key and multiple `null` values.
            - Provides constant-time performance for basic operations (`put` and `get`).
            - Suitable for quick lookups where order is not important.

        2. **LinkedHashMap**:
            - Maintains insertion order of elements.
            - Useful when order is important, such as in caches or ordered processing.
            - Slightly slower than `HashMap` due to maintaining order, but allows quick iteration in the order of insertion.

        3. **TreeMap**:
            - Maintains elements in a natural sorted order (ascending by default).
            - Does not allow `null` keys but allows multiple `null` values.
            - Useful when sorted order of keys is required, such as in range-based retrieval or alphabetical listings.
            - Based on a Red-Black tree structure, so performance may be slower for large datasets compared to `HashMap`.

    - **Example**:
        - Below, we demonstrate adding elements to each map and observe differences in output order.
    */

    public static void main(String[] args) {

        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("C", 3);
        hashMap.put("B", 2);
        System.out.println("HashMap (unordered): " + hashMap);

        // LinkedHashMap example
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("C", 3);
        linkedHashMap.put("B", 2);
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);

        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        System.out.println("TreeMap (sorted order): " + treeMap);
    }
}

