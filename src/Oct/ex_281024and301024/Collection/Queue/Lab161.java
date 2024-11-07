package Oct.ex_281024and301024.Collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab161 {

    // Iterating through Queue

    /*
    Notes:
    - **Iteration over Queue**:
        - Since `Queue` follows the first-in-first-out (FIFO) principle, iteration typically displays elements in the order of their natural ordering (or as determined by a comparator in a `PriorityQueue`).

    - **Types of Iteration**:
        - **Using Iterator**:
            - Provides a way to iterate through elements one by one.
            - Calling `iterator.next()` retrieves the next element in the queue.
            - `iterator.hasNext()` checks if there are more elements.
        - **Using Enhanced for-loop**:
            - Simplifies iteration by automatically fetching elements.
            - Can be used for any collection that implements the `Iterable` interface.

    - **Example**:
        - Here, we demonstrate iterating with an `Iterator` and an enhanced for-loop.
    */

    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Hello");
        queue.add("World");
        queue.add("Queue");
        queue.add("Iteration");

        System.out.println("Queue elements: " + queue);

        // Type 1: Iterating using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Type 2: Iterating using an enhanced for-loop
        System.out.println("\nIterating using enhanced for-loop:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}

