package Oct.ex_281024and301024.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab157 {

    /*
    Set Implementations:
    - **HashSet**:
        - No order guaranteed.
        - Uses a hash table for storage.
        - Fast operations (add, remove, contains) with average time complexity O(1).

    - **LinkedHashSet**:
        - Maintains the insertion order of elements.
        - Uses a combination of hash table and linked list.
        - Iteration order is predictable, based on the order of insertion.

    - **TreeSet**:
        - Implements a Red-Black tree structure to store elements.
        - Maintains a natural order (sorted).
        - Operations (add, remove, contains) have a time complexity of O(log n).
    */

    public static void main(String[] args) {

        // HashSet example
        Set<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Pear");
        hs.add("Grape");
        hs.add("Pineapple");
        System.out.println("HashSet (no order): " + hs);

        // LinkedHashSet example
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Orange");
        lhs.add("Pear");
        lhs.add("Grape");
        lhs.add("Pineapple");
        System.out.println("LinkedHashSet (insertion order): " + lhs);

        // TreeSet example
        Set<String> ts = new TreeSet<>();
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Orange");
        ts.add("Pear");
        ts.add("Grape");
        ts.add("Pineapple");
        System.out.println("TreeSet (sorted order): " + ts);
    }
}

