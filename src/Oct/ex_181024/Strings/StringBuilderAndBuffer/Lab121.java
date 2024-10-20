package Oct.ex_181024.Strings.StringBuilderAndBuffer;

public class Lab121 {
    // StringBuilder example

    /*
    Notes:
    - StringBuilder is used for string manipulations like appending, inserting, deleting, or modifying strings.
    - It is faster and more efficient than the String class for such operations because it's mutable.
    - Suitable for single-threaded environments. For multi-threaded environments, use StringBuffer (thread-safe but slower).
    - StringBuilder allows modification of string content without creating new objects, which improves memory efficiency.
    - The key difference from String is that String is immutable, while StringBuilder is mutable.
    - It provides a variety of methods like append(), delete(), insert(), reverse(), and replace() to manipulate the content.
    - StringBuilder does **not** override equals() or hashCode(), so comparing two StringBuilder objects with equals() checks for reference equality, not content.
    - StringBuilder is part of the `java.lang` package and doesn't need to be imported explicitly.
    */

    public static void main(String[] args) {

        // Create a new StringBuilder with initial content "Hello"
        StringBuilder s1 = new StringBuilder("Hello");

        // Appending "World" to the existing content
        s1.append("World");
        System.out.println(s1);  // Output: HelloWorld

        // Deleting characters from index 1 to 2 (exclusive) -> Removes the letter 'e'
        s1.delete(1, 2);
        System.out.println(s1);  // Output: HlloWorld

        // Deleting the character at index 1 -> Removes the letter 'l'
        s1.deleteCharAt(1);
        System.out.println(s1);  // Output: HloWorld

        // Reverse the current content of StringBuilder
        s1.reverse();
        System.out.println(s1);  // Output: dlroWolH

        // Replacing the substring between index 0 and 2 with "Java"
        s1.replace(0, 2, "Java");
        System.out.println(s1);  // Output: JavaoWolH

        /*
        Additional Notes:
        - append(String): Adds a string to the end of the current StringBuilder content.
        - delete(int start, int end): Removes the substring between the start and end indices.
        - deleteCharAt(int index): Removes the character at the specified index.
        - reverse(): Reverses the sequence of characters in StringBuilder.
        - replace(int start, int end, String str): Replaces the substring from start (inclusive) to end (exclusive) with the provided string.

        StringBuilder also provides:
        - insert(int offset, String str): Inserts the specified string at the given index.
        - capacity(): Returns the current capacity of the StringBuilder (how much space is allocated for its content).
        - ensureCapacity(int minimumCapacity): Ensures that the StringBuilder has at least the specified capacity, avoiding frequent reallocation.
        - setLength(int newLength): Changes the length of the StringBuilder.
        */
    }
}

