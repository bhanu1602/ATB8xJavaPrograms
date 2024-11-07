package Oct.ex_281024and301024.Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lab149 {

    // Iterating through LinkedList
    /*
    Notes:
    - LinkedLists are doubly-linked, providing efficient insertions and deletions.
    - Iteration techniques vary in suitability:
      1. For-loop with get(): Useful when accessing elements by index, though it’s generally slower with LinkedLists than ArrayLists.
      2. Enhanced for-loop: Concise and readable, best for simply reading each element.
      3. Iterator: Safe for modifying collections during traversal.
      4. ListIterator: Extends Iterator with bidirectional traversal and element modification.
      5. forEach: Allows lambda expressions for concise iteration.

    Additional Functionalities:
    - `peekFirst()` and `peekLast()`: Preview the first and last elements without removal.
    - `addFirst()` and `addLast()`: Insert elements at the beginning or end efficiently.
    */

    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Collections");

        System.out.println("Original List: " + list);
        System.out.println("----------------------");

        // Using for-loop with get() method
        System.out.println("Using for-loop with get():");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------------------");

        // Using enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("----------------------");

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");

        // Using ListIterator for bidirectional traversal
        System.out.println("Using ListIterator (Forward):");
        ListIterator<Object> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("----------------------");

        System.out.println("Using ListIterator (Backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("----------------------");

        // Using forEach method
        System.out.println("Using forEach method:");
        list.forEach(System.out::println);

    }
}

