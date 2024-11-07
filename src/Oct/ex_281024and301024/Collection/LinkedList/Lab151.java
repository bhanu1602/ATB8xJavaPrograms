package Oct.ex_281024and301024.Collection.LinkedList;

import java.util.LinkedList;

import java.util.LinkedList;

public class Lab151 {

    // Demonstrating LinkedList functions

    /*
    Notes:
    - Advantages:
      * Dynamic Size: LinkedLists grow and shrink in size dynamically without any memory overhead.
      * Efficient Insertions/Deletions: Adding or removing elements from the beginning or end is efficient (O(1) complexity).
      * Flexible Iteration: LinkedList supports both forward and backward traversal through its elements.

    - Disadvantages:
      * Slower Access: LinkedLists are slower in accessing elements by index compared to ArrayLists (O(n) complexity for access).
      * Memory Overhead: Each element has additional memory overhead for storing pointers to the next and previous nodes.

    Common LinkedList Methods:
    - addFirst(Object): Adds an element at the beginning.
    - addLast(Object): Adds an element at the end.
    - removeFirst(): Removes the first element.
    - removeLast(): Removes the last element.
    - getFirst(): Retrieves, but does not remove, the first element.
    - getLast(): Retrieves, but does not remove, the last element.
     */

    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Initial LinkedList: " + list);
        System.out.println("Size: " + list.size());

        // Removing first and last elements
        list.removeFirst();
        System.out.println("After removing first element: " + list);
        list.removeLast();
        System.out.println("After removing last element: " + list);

        // Adding elements at the beginning and end
        list.addFirst(0);
        System.out.println("After adding at first position: " + list);
        list.addLast(4);
        System.out.println("After adding at last position: " + list);

        // Accessing elements without removing
        System.out.println("First element (peek): " + list.peekFirst());
        System.out.println("Last element (peek): " + list.peekLast());

        // Clearing the list
        list.clear();
        System.out.println("After clearing LinkedList: " + list);
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}

