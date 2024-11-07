package Oct.ex_281024and301024.Collection.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Lab158 {

    /*
    Notes on Queue:

    - **Queue Interface**:
        - Follows a first-in, first-out (FIFO) order for elements.
        - Queue interface is in `java.util` package, providing basic methods like add, remove, and peek.
        - Operations:
            - Elements are added at the end of the queue.
            - Elements are removed from the front of the queue.

    - **Thread Safety**:
        - Standard `Queue` implementations like `PriorityQueue` and `LinkedList` are not thread-safe.
        - Use `PriorityBlockingQueue` from `java.util.concurrent` if a thread-safe queue is needed.

    - **Null Values**:
        - Null elements are not allowed in most `Queue` implementations, as they can cause `NullPointerException` in operations.

    - **Types of Queues**:
        - `PriorityQueue` (unbounded, ordered by natural order or custom comparator)
        - `LinkedList` (implements both `Queue` and `Deque`, allows FIFO operations)
        - `PriorityBlockingQueue` (bounded, thread-safe)

    - **Unbounded vs. Bounded Queues**:
        - Queues in `java.util` are generally unbounded (no fixed capacity).
        - Queues in `java.util.concurrent` can be bounded, allowing a fixed size limit.
    */

    public static void main(String[] args) {

        // Using PriorityQueue (not thread-safe, ordered by natural ordering)
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.add(10);
        queue1.add(5);
        queue1.add(20);
        System.out.println("PriorityQueue (natural order): " + queue1);

        // Using LinkedList as a Queue (FIFO order)
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(10);
        queue2.add(5);
        queue2.add(20);
        System.out.println("LinkedList (FIFO order): " + queue2);

        // Using PriorityBlockingQueue (thread-safe, natural ordering)
        Queue<Integer> queue3 = new PriorityBlockingQueue<>();
        queue3.add(10);
        queue3.add(5);
        queue3.add(20);
        System.out.println("PriorityBlockingQueue (thread-safe, natural order): " + queue3);
    }
}

