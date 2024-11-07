package Oct.ex_281024and301024.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab159 {

    // Creating Queue objects with Generics

    /*
    Notes:
    - **Queue Interface**:
        - Queue is an interface, so it cannot be instantiated directly.
        - To create a Queue object, we need a concrete implementation, like `PriorityQueue`, `LinkedList`, etc.

    - **Generics**:
        - Since Java 1.5, Generics allow us to specify the type of objects that can be stored in a Queue.
        - By using generics, we can enforce type safety, meaning only objects of a specified type can be added to the queue.
        - For example, `Queue<String>` allows only String objects, while `Queue<Integer>` would only accept Integer objects.

    - **Example**:
        - Below, we create a `Queue<Object>` using `PriorityQueue` as the implementation. This allows any type of object to be stored.
    */

    public static void main(String[] args) {

        // Creating a Queue with Object type
        Queue<Object> queue = new PriorityQueue<>();

        // Adding elements of different types (demonstrates lack of type restriction with Object)
        queue.add("Text");    // Adding a String
        queue.add(123);       // Adding an Integer
        queue.add(45.67);     // Adding a Double

        System.out.println("Queue elements: " + queue);
    }
}

