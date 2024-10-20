package Oct.ex_181024.Strings.Basics;

public class Lab118 {

    // Why Strings are immutable in Java

    /*
    Notes:

    - **String immutability** in Java means once a string object is created, it cannot be modified.
    - When you perform operations like concatenation, Java doesn't modify the original string; instead, it creates a new string.
    - Immutability provides several benefits like security, synchronization, and performance optimization by reusing objects in the **String Constant Pool**.

    **Key reasons for immutability**:
    1. **String Pool Efficiency**: Immutable strings allow Java to safely reuse string literals in the String Constant Pool, reducing memory usage.
    2. **Thread Safety**: Since strings cannot be modified, multiple threads can share the same string object without synchronization issues.
    3. **Security**: Many classes use strings for keys and identifiers (e.g., database URLs, file paths), and immutability ensures that these values cannot be changed once assigned.
    4. **HashCode Caching**: Since strings are immutable, their hash codes are cached. This is beneficial when strings are used as keys in hash-based collections like `HashMap`.

    Example:
    */

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = s1.concat(" World");  // Concatenates " World" to s1, but returns a new string
        System.out.println(s2);  // Prints "Hello World"
        System.out.println(s1);  // Prints "Hello", the original string remains unchanged

        /*
        Explanation:
        - `s1.concat(" World")` doesn't modify `s1`. It returns a **new string** that combines "Hello" and " World".
        - `s1` remains the same because strings are immutable. The result of concatenation is stored in a new string `s2`.
        - This behavior helps Java optimize memory usage by avoiding unnecessary modifications of string objects.
        */
    }
}

