package Oct.ex_181024.Strings.Basics;

public class StringBasics {

    // String Basics

    /*
    Notes

    - A String is a collection or sequence of characters.
    - It is an object in Java that stores characters in a sequence using 16-bit Unicode (UTF-16).
    - String class is part of the `java.lang` package.
    - It is a final class, meaning you cannot extend it to create a subclass.
    - String class implements the following interfaces:
      - java.io.Serializable
      - java.lang.Comparable
      - java.lang.CharSequence
    - Internally, the String class holds a private final char array:
      private final char value[];
    - Strings in Java are immutable, meaning their value cannot be changed once created.
      Any operation that appears to modify a String actually creates a new String object.

    **Why are Strings Immutable?**
    - Efficiency: String immutability helps optimize memory usage.
    - Security: Immutable strings prevent accidental or malicious modifications, especially for sensitive data like file paths or database URLs.
    - Thread Safety: Immutable objects are inherently thread-safe, eliminating synchronization concerns.

    **How Strings can be represented in Java?**
    - String class
    - StringBuffer (mutable, thread-safe)
    - StringBuilder (mutable, not thread-safe, faster than StringBuffer)
    - Array of characters
    - ArrayList of characters

    **Ways to create a String in Java:**
    1) String Literal
    2) Using the new Keyword

    **String literals**:
    - Stored in a special memory area called the "String Constant Pool".
    - When the same string is assigned to another variable, no new object is created. Both variables reference the same object in the pool.
    */

    // String literal example

    public static void main(String[] args) {
        // Creating a String using a literal
        String name = "Amit";  // Stored in the String Constant Pool

        System.out.println("Name: " + name);

        // Reassigning the String reference
        name = "Bhanu";  // Creates a new String object in the pool, "Amit" still exists but not referenced by 'name'

        // Printing the new String value
        System.out.println("Updated Name: " + name);

        /*
         Explanation:
         - When you assign "Amit" to the `name` variable, it checks if the value already exists in the String Constant Pool.
         - When the value is changed to "Bhanu", Java creates a new object for "Bhanu" in the pool and `name` now references this new string.
         - The original string "Amit" still exists in memory but is no longer referenced.
         */
    }
}
