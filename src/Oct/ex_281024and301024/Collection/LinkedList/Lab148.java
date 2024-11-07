package Oct.ex_281024and301024.Collection.LinkedList;

import java.util.LinkedList;

import java.util.LinkedList;

public class Lab148 {

    // Functions of LinkedList
    /*
    Notes
    add(Object): Adds an element to the end of the LinkedList.
    add(int index, Object): Adds an element at a specific index in the LinkedList.
    set(int index, Object): Updates an element at a specific index in the LinkedList.
    remove(Object): Removes the first occurrence of a specific object.
    remove(int index): Removes the element at the specified index.
    peek(): Retrieves, but does not remove, the first element.
    peekFirst(): Retrieves the first element without removing it (same as peek in LinkedList).
    poll(): Retrieves and removes the head (first element).
    offer(Object): Adds an element at the end of the list (alternative to add).
    clear(): Removes all elements from the LinkedList.
    */

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        // Adding elements to list
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        System.out.println("Original List: " + names);

        // Add at a specific index
        names.add(1, "Alice");
        System.out.println("After adding 'Alice' at index 1: " + names);

        // Update an element using set
        names.set(2, "Marley");
        System.out.println("After setting index 2 to 'Marley': " + names);

        // Deleting elements
        names.remove(1);
        System.out.println("After removing element at index 1: " + names);
        names.remove("Marley");
        System.out.println("After removing 'Marley': " + names);

        // Retrieve elements without removing
        System.out.println("Peek (first element): " + names.peek());
        System.out.println("Peek First (first element): " + names.peekFirst());

        // Adding and removing with additional methods
        names.offer("Charlie"); // Adds to the end of the list
        System.out.println("After offer 'Charlie': " + names);

        System.out.println("Poll (retrieves and removes first element): " + names.poll());
        System.out.println("After poll: " + names);

        // Clear all elements
        names.clear();
        System.out.println("After clearing all elements: " + names);
    }
}
