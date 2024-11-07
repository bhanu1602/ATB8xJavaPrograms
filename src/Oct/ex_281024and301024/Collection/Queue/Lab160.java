package Oct.ex_281024and301024.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Lab160 {

    // Operations on Queue Interface

    /*
    Notes:
    - **Queue Operations**:
        - `add(E e)`: Inserts the specified element into the queue. Throws an exception if the queue is full.
        - `offer(E e)`: Inserts the specified element into the queue. Returns false if the queue is full instead of throwing an exception.
        - `remove(Object o)`: Removes a single instance of the specified element from the queue, if present.
        - `poll()`: Retrieves and removes the head of the queue, or returns null if the queue is empty.
        - `peek()`: Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.

    - **Differences between `add` and `offer`**:
        - Both methods are used to insert elements into the queue.
        - `add` throws an exception if it fails to add the element, while `offer` returns false if it fails.

    - **Example**:
        - Below, we demonstrate adding and removing elements, and then printing the queue to see the final state.
    */

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Alice");         // Using add method
        queue.offer("Bob");         // Using offer method

        // Removing an element from the queue
        queue.remove("Bob");        // Removing "Bob" from the queue

        // Displaying the elements in the queue
        System.out.println("Queue after operations: " + queue);

        // Additional operations
        System.out.println("Peek at head: " + queue.peek()); // Retrieve head without removing
        System.out.println("Poll head: " + queue.poll());    // Retrieve and remove head
        System.out.println("Queue after poll: " + queue);    // Queue after poll operation
    }
}

