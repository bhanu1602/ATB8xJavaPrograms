package sept.ex_130924;

public class Lab018 {

    // String Literals in Java

    /*
     * String Literals:
     * - A string literal is a sequence of characters enclosed in double quotes (" ").
     * - In Java, strings are objects of the `String` class.
     * - String literals are automatically interned, meaning that they are stored in a common pool
     *   to save memory and avoid duplication of identical string values.
     * - Example: String str = "Hello World";
     *
     * Characteristics of String Literals:
     * 1. Strings are immutable in Java, meaning once a string object is created, its value cannot be changed.
     * 2. When a new string literal is created, the JVM checks if that literal already exists in the string pool.
     *    - If it exists, the reference to the existing string is returned.
     *    - If it does not exist, a new string object is created in the pool.
     *
     * Escape Sequences in Strings:
     * - Special characters can be used inside string literals using escape sequences.
     * - Some commonly used escape sequences are:
     *   - `\n` : New line
     *   - `\t` : Tab space
     *   - `\"` : Double quote
     *   - `\\` : Backslash
     *
     * Concatenation:
     * - Strings can be concatenated (joined) using the `+` operator.
     * - Example: String fullName = "John" + " " + "Doe"; // Results in "John Doe"
     * - Alternatively, the `concat()` method can also be used to join strings.
     */

    public static void main(String[] args) {

        // Example of a string literal
        String greeting = "Hello, World!"; // String literal assigned to variable 'greeting'

        // Example of string concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // Using `+` operator to concatenate

        // Printing the strings
        System.out.println(greeting);
        System.out.println("Full name: " + fullName);

        // Example of escape sequences
        String withNewLine = "Hello\nWorld";   // New line escape sequence
        String withTab = "Hello\tWorld";       // Tab escape sequence
        String withQuote = "He said, \"Hello World\""; // Double quote escape sequence

        // Printing escape sequences
        System.out.println(withNewLine);
        System.out.println(withTab);
        System.out.println(withQuote);
    }
}

