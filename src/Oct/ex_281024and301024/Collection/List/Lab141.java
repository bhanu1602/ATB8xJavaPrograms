package Oct.ex_281024and301024.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Lab141 {

    // Lists

    /*
    Notes

    - **List** is an interface in Java's `java.util` package.
    - **Characteristics**:
      - **Ordered**: Maintains the order of insertion.
      - **Allows Duplicates**: Enables duplicate elements.
      - **Index-Based Access**: Elements can be accessed directly by index.

    **Initialization Options**:
    - `List<String> list = List.of("banana", "apple", "grapes", "orange");` // Immutable list
    - `List<String> list = new ArrayList<>();` // Mutable list

    **Common Implementation Classes**:
    - `ArrayList`: Fast access with index, backed by an array. Good for read-heavy operations.
    - `LinkedList`: Fast insertion/removal with nodes. Good for write-heavy operations.
    - `Stack`: LIFO (Last In, First Out) data structure.
    - `Vector`: Synchronized version, similar to `ArrayList`, but slower due to synchronization.

    **Syntax of Java List**:
    - `List<Type> list = new ArrayList<Type>();` // Allows specifying element type for type safety.

    **Methods & Functionalities**:
    - Basic operations: `add()`, `remove()`, `get()`, `set()`, `contains()`.
    - Allows forward and backward traversal through the `ListIterator`.
    - `List.of()` provides an immutable list, ideal for read-only scenarios.

    **Example Limitations**:
    - Immutable lists like `List.of()` do not support operations like `add()` or `remove()`, which will throw `UnsupportedOperationException`.

    */

    public static void main(String[] args) {

        // Immutable list with List.of()
        List<String> list = List.of("Banana", "Apple");
        System.out.println("Immutable List: " + list);
        System.out.println("Size of list: " + list.size());

        // Uncommenting the line below will throw an UnsupportedOperationException
        // list.add("Guava"); // Unsupported operation in immutable list

        // Mutable list with ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Mutable List: " + fruits);
        fruits.add("Guava"); // Allowed in mutable lists
        System.out.println("Updated Mutable List: " + fruits);
    }
}


