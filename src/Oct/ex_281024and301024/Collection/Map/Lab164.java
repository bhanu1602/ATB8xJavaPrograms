package Oct.ex_281024and301024.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab164 {

    // Operations on Map

    /*
    Notes:
    - **Map Overview**:
        - `Map` is a collection that stores key-value pairs, where each key is unique.
        - Common implementations include `HashMap`, `LinkedHashMap`, and `TreeMap`.

    - **Generics**:
        - The use of generics (e.g., `Map<Integer, String>`) ensures type safety, specifying that the map will have `Integer` keys and `String` values.
        - Without generics, the map can store any types of keys and values, which could lead to `ClassCastException` during retrieval.

    - **Basic Map Operations**:
        - `put(K key, V value)`: Adds or updates a key-value pair.
        - `remove(Object key)`: Removes the entry for the specified key.
        - `get(Object key)`: Retrieves the value associated with the specified key, or `null` if not present.
        - `containsKey(Object key)`: Checks if a specified key exists in the map.
        - `containsValue(Object value)`: Checks if a specified value exists in the map.

    - **Example Operations**:
        - Adding entries: `map.put(1, "G")`
        - Updating entries: Re-adding an entry with the same key updates the value.
        - Removing entries: `map.remove(3)` removes the entry with key `3`.

    - **Integer Key Handling**:
        - The code demonstrates adding entries using `Integer` keys.
        - Creating a new `Integer` with `new Integer(1)` is redundant in modern Java (since autoboxing automatically converts `int` to `Integer`), but this highlights explicit type conversion.
    */

    public static void main(String[] args) {

        Map<Integer, String> defaultMap = new HashMap<>();

        // Using generics to specify key and value types
        Map<Integer, String> map = new HashMap<>();

        // Adding entries to the map
        map.put(1, "G");
        map.put(2, "M");
        map.put(3, "P");

        // Updating an entry by re-adding with the same key
        map.put(1, "God"); // The value for key 1 is updated from "G" to "God"

        // Removing an entry with key 3
        map.remove(3);

        System.out.println("Final map contents: " + map); // Outputs {1=God, 2=M}
    }
}

