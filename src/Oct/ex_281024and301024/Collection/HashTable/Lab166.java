package Oct.ex_281024and301024.Collection.HashTable;

import java.util.Hashtable;

public class Lab166 {

    // Hashtable

    /*
    Notes:
    - `Hashtable` is part of Java's legacy collection classes, storing key-value pairs in a hash table.
    - It is synchronized, meaning it is thread-safe, but this also makes it slower than `HashMap`.
    - Key and value pairs cannot be `null`. Any attempt to use `null` as a key or value results in `NullPointerException`.
    - `Hashtable` was introduced in Java 1.0, before the Collections Framework in Java 2.
    - Differences from `HashMap`:
        - `Hashtable` is synchronized, while `HashMap` is not.
        - `Hashtable` does not allow `null` keys or values.
        - `Hashtable` provides `Enumeration` (not fail-fast) in addition to `Iterator`.
    - Default initial capacity is 11, with a load factor of 0.75.
    - It's often recommended to use `ConcurrentHashMap` or `HashMap` for better performance unless synchronization is explicitly needed.
    */

    public static void main(String[] args) {

        // Creates an empty hashtable with the default load factor (0.75) and an initial capacity (11).
        Hashtable<Integer, String> ht = new Hashtable<>();

        // Using generics to specify key-value types
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

        // Adding elements using put method
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");

        ht2.put(4, "Four");
        ht2.put(5, "Five");
        ht2.put(6, "Six");

        // Creating a Hashtable with an initial capacity
        Hashtable<Integer, String> ht3 = new Hashtable<>(4); // initial capacity
        ht3.put(1, "One");
        ht3.put(2, "Two");
        ht3.put(3, "Three");
        ht3.put(4, "Four");
        System.out.println("Hashtable ht3: " + ht3);

        // Hashtable with initial capacity and generics
        Hashtable<Integer, String> ht4 = new Hashtable<Integer, String>(4);

        // Hashtable with initial capacity and specified load factor
        Hashtable<Integer, String> ht5 = new Hashtable<>(4, 0.75f);

        // Hashtable with initial capacity, load factor, and generics
        Hashtable<Integer, String> ht6 = new Hashtable<Integer, String>(4, 0.75f);

        // Creating a new Hashtable with existing Hashtable content
        Hashtable<Integer, String> ht7 = new Hashtable<>(ht); // copy constructor
        System.out.println("Hashtable ht7 (copy of ht): " + ht7);

    }
}
