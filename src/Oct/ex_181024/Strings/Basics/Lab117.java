package Oct.ex_181024.Strings.Basics;

public class Lab117 {

    // Using the new keyword example

    /*
    Notes:

    - When we use the `new` keyword to create a string, it creates a new object in the **heap memory**, even if the same string already exists in the String Constant Pool.
    - A literal version of the string may still be placed in the String Constant Pool, but the new keyword ensures a separate object in the heap.
    - This means that even if an identical string exists in the pool, using `new` will always create a new object in the heap.

    **Memory Allocation Differences:**
    - **Literal String**: Stored in the String Constant Pool. If an identical literal already exists, no new object is created.
    - **Using new Keyword**: Creates a new string object in the heap, even if an identical string exists in the String Constant Pool.
    */

    public static void main(String[] args) {

        // Creating a string using the new keyword
        String str = new String("Hello World");  // "Hello World" is stored in the heap and the String Constant Pool

        System.out.println(str);  // This prints the value "Hello World"

        // Reassigning str with a new String object created using new keyword
        str = new String("Hello");  // "Hello" now creates another object in heap memory

        System.out.println(str);  // This prints the value "Hello"

        /*
        Explanation:
        - In both cases, the `new String()` creates new string objects in heap memory.
        - Even though "Hello World" and "Hello" literals are placed in the String Constant Pool, the `str` variable holds references to separate objects in the heap.
        - This can be less memory efficient compared to string literals, as new objects are created unnecessarily in some cases.
        */
    }
}

