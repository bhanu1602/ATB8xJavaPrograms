package Oct.ex_281024and301024.Collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Lab147 {
    // Linked List

    /*
    Notes:
    - LinkedList is part of the Java Collection Framework and resides in the java.util package.
    - It stores data using nodes with pointers that link each element.
    - It is a linear data structure where each element (node) contains two parts: data and the address of the next node.
    - Ideal for applications where frequent insertions and deletions are required, as they are more efficient than arrays in this regard.
    - Disadvantages:
        - Nodes cannot be accessed directly; traversal is required, starting from the head node.
    - LinkedList is implemented as a doubly linked list, which allows traversal in both directions (forward and backward).
    - No need to specify the initial size, as it dynamically adjusts.

    Constructors:
    - `LinkedList()` - Creates an empty LinkedList.
    - `LinkedList(Collection<? extends E> c)` - Creates a LinkedList with elements of the given collection, preserving the order.
    */

        public static void main(String[] args) {

            // Example to create LinkedList and ArrayList

            // Creating an empty LinkedList of Integers
            List<Integer> list = new LinkedList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println("LinkedList: " + list);

            // Creating an ArrayList and initializing it with elements
            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            System.out.println("ArrayList: " + list2);

            // Arrays for storing values
            Integer[] a = new Integer[5]; // Integer array with default null values
            String[] names = new String[5]; // String array with default null values

        }
    }


