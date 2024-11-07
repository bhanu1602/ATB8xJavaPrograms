package Oct.ex_281024and301024.Collection.Vector;

import java.util.List;
import java.util.Vector;

public class Lab146 {

    // Vectors

    /*
    Notes:
    - Implements a dynamic array, similar to ArrayList, but is synchronized by default.
    - Originally part of Java's legacy collections (prior to the introduction of the Collection framework in Java 1.2).
    - Due to synchronization, Vector is generally slower compared to ArrayList.
    - While Vector is not deprecated, it is less commonly used since Java 5 introduced alternatives like ArrayList.
    - Found in java.util package.
    - Can be used in multithreaded environments if thread safety is required.

    Alternatives:
    - Prefer using ArrayList for single-threaded access.
    - For synchronized list usage, consider Collections.synchronizedList(new ArrayList<>()).
    */

    public static void main(String[] args) {

        // Example 1: Using Vector without generics (older style)
        Vector v = new Vector(); // Capacity defaults to 10 and doubles when needed
        v.add("Alice");
        v.add("Bob");
        v.add("Charlie");
        System.out.println("Vector with String elements: " + v);

        // Example 2: Using Vector with generics (recommended style)
        List<Integer> v1 = new Vector<Integer>();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        System.out.println("Vector with Integer elements: " + v1);

        // Capacity and Size
        System.out.println("Initial Capacity of v1: " + ((Vector<Integer>) v1).capacity());
        System.out.println("Size of v1: " + v1.size());

        // Other common methods
        ((Vector<Integer>) v1).add(2, 5);  // Insert element at index
        System.out.println("After inserting 5 at index 2: " + v1);

        // Removing elements
        v.remove("Bob");  // Remove by value
        System.out.println("After removing 'Bob' from v: " + v);
        v1.remove(1);  // Remove by index
        System.out.println("After removing element at index 1 from v1: " + v1);
    }
}

