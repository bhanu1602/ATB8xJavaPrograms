package Oct.ex_281024and301024.Collection.Set;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab155 {

    /*
    Notes

    - **Set Interface**: A collection that prohibits duplicate elements and allows only unique values.
    - **HashSet**: An implementation of the Set interface backed by a hash table. It provides:
        - **Unordered**: The elements in a HashSet are not stored in any particular order.
        - **Constant Time Complexity**: Operations like add, remove, and contains have an average time complexity of O(1).
    - **Usage**: Useful when you want to ensure that a collection does not contain duplicates and the order of elements does not matter.
    - **Null Values**: HashSet allows one null value.
    - **Iterating**: While HashSet does not maintain order, you can iterate through it using a for-each loop or an iterator.
    */

    public static void main(String[] args) {

        // Creating a HashSet to store elements
        Set<Object> set = new HashSet<>(); // Using HashSet implementation of Set interface

        // Adding elements to the set
        set.add("A"); // String element
        set.add(1);   // Integer element
        set.add("B"); // Another String element
        set.add(2);   // Another Integer element

        // Checking if an element is present
        System.out.println("Does the set contain 'A'? " + set.contains("A"));

        // Removing an element
        set.remove("B");

        // Displaying all elements in the set
        System.out.println("Set contents after removal: " + set);

        // Additional operations
        // Adding duplicate element (this will not change the set)
        set.add("A");
        System.out.println("Set contents after attempting to add duplicate 'A': " + set);

        // Adding null value
        set.add(null);
        System.out.println("Set contents after adding null: " + set);
    }
}

