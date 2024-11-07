package Oct.ex_281024and301024.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Lab142 {

    // Methods in List

    /*
    Notes:
    - `add()`: Adds an element to the list.
    - `set()`: Updates the element at a specified index.
    - `indexOf()` and `lastIndexOf()`: Returns the index of the specified element; if not found, returns -1.
    - `remove()`: Removes an element by index or value.
    - `get()`: Accesses an element at a specified index.
    - `contains()`: Checks if a specified element exists in the list.
    - `addAll()`: Adds a collection of elements to the list at a specified index.
    - `hashCode()`: Returns the hash code of the list.
    - `isEmpty()`: Checks if the list is empty.
    - `containsAll()`: Checks if the list contains all elements of a specified collection.
    - `clear()`: Removes all elements from the list.
    - `sort()`: Sorts the list.
    */

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        // Adding elements
        list.add(1);
        list.add("Alice");
        list.add(Boolean.FALSE);
        list.add(null);
        System.out.println("List after add: " + list);

        // Updating element at index 1
        list.set(1, "Alice Bob");
        System.out.println("List after set: " + list);

        // Searching for element indices
        System.out.println("Index of 'Alice Bob': " + list.indexOf("Alice Bob"));
        System.out.println("Last index of 1: " + list.lastIndexOf(1));

        // Removing an element by index
        list.remove(1);
        System.out.println("List after remove: " + list);

        // Accessing an element
        Object access = list.get(2);
        System.out.println("Element at index 2: " + access);

        // Checking if an element exists
        boolean isPresent = list.contains(1);
        System.out.println("Contains 1? " + isPresent);

        // Adding multiple elements at a specific index
        List<Object> newElements = List.of("New Element", 3.14);
        list.addAll(2, newElements);
        System.out.println("List after addAll: " + list);

        // Hash code of the list
        System.out.println("List hashCode: " + list.hashCode());

        // Checking if list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is list empty? " + isEmpty);

        // Clearing the list
        list.clear();
        System.out.println("List after clear: " + list);

        // Adding elements again for sorting
        list.add("Banana");
        list.add("Apple");
        list.add("Grapes");

        // Sorting the list (requires same type elements)
        list.sort(null);
        System.out.println("List after sort: " + list);
    }
}

