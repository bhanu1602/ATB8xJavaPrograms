package Oct.ex_281024and301024.Basics;

public class Lab140 {

    // Collection Framework

    /*
    Notes:
    Focus on Main Business Logic rather than Low-Level Logics.

    Problems with Arrays:
    ----------------------
    - Fixed Size: Memory is wasted if the specified size is not fully utilized.
    - Complex Insertion and Deletion: Modifying elements in arrays can be cumbersome.
    - Limited Functionalities: Arrays lack built-in support for operations like sorting, searching, and resizing.

    Solution: Java Collection Framework
    ----------------------
    The Collection Framework addresses these limitations, providing a flexible and efficient set of interfaces and classes to manage data.

    Legacy APIs:
    - Legacy classes provide backward compatibility with earlier versions of Java.

    Legacy Classes:
    - `Vector`, `Stack`, `Properties`, `Hashtable`, and `Dictionary` are some of the legacy classes still available in the framework.

    Legacy Interface:
    - `Enumeration` is a cursor used to traverse legacy collections like `Vector` and `Hashtable`.

    Example of Enumeration with a Vector:
    -------------------------------------
    ```
    Vector<String> v = new Vector<>();
    v.add("Example");
    Enumeration<String> e = v.elements();
    while (e.hasMoreElements()) {
        System.out.println(e.nextElement());
    }
    ```

    Collection vs. Collections:
    ---------------------------
    - `Collection` is the root interface of most Java collections (List, Set, Queue).
    - `Collections` is a utility class that provides static methods for collection operations like sorting and searching.

    Key Components:
    ---------------
    - Collection: The main interface for List, Set, and Queue.
    - Map: A separate root interface for key-value pair collections.

    Advantages of the Collection Framework:
    ---------------------------------------
    - **Reduces Programming Effort**: Streamlines data management and manipulation.
    - **Increases Program Efficiency and Quality**: Simplifies data handling with ready-made methods.
    - **Consistent API**: Core methods like `add()`, `remove()`, and `contains()` are standardized across collections, ensuring consistency and ease of use.

    */
}
