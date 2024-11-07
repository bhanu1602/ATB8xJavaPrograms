package Oct.ex_281024and301024.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab163 {

    // Understanding Map and Object Creation

    /*
    Notes:
    - **Map Interface**:
        - `Map` is an interface in Java, so you cannot create an instance of `Map` directly.
        - You need to use one of its implementing classes (like `HashMap`, `TreeMap`, or `LinkedHashMap`) to create a `Map` object.

    - **Generics in Java**:
        - Since Java 1.5, Generics allow specifying the types of keys and values in a `Map`, providing type safety.
        - Example: `Map<String, Integer>` restricts keys to `String` and values to `Integer`.

    - **Properties of Map**:
        - **Unique Keys**: A `Map` cannot contain duplicate keys; each key can map to only one value.
        - **Null Values**: Some implementations (like `HashMap` and `LinkedHashMap`) allow `null` keys and values, while `TreeMap` does not allow `null` keys.
        - **Order**:
            - `HashMap`: No guaranteed order.
            - `LinkedHashMap`: Maintains insertion order.
            - `TreeMap`: Maintains natural order of keys (or custom order if a `Comparator` is provided).

    - **Map Types**:
        - `Map`: Basic interface for key-value pairs.
        - `SortedMap`: A subinterface that maintains order of keys.
        - Common Implementations:
            - `HashMap`: Fast access with no guaranteed order.
            - `LinkedHashMap`: Insertion-order maintained, useful for ordered processing.
            - `TreeMap`: Maintains sorted order of keys, suitable for ordered retrievals.
    */

    public static void main(String[] args) {

        // Creating a HashMap instance of Map
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 1);
        hashMap.put("Bob", 2);
        hashMap.put("Charlie", 3);

        System.out.println("HashMap elements: " + hashMap);
    }
}

