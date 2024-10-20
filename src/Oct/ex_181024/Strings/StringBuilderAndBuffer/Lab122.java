package Oct.ex_181024.Strings.StringBuilderAndBuffer;

public class Lab122 {

    // StringBuffer Example

    /*
    Notes:
    - `StringBuffer` is used to perform mutable string operations, similar to `StringBuilder`.
    - The key difference between `StringBuffer` and `StringBuilder` is that `StringBuffer` is **thread-safe**, making it suitable for multi-threaded environments.
    - `StringBuffer` provides synchronized methods to ensure that it can be safely accessed by multiple threads at the same time.
    - While `StringBuffer` is thread-safe, it can be slower than `StringBuilder` due to the added synchronization overhead.
    - Just like `StringBuilder`, `StringBuffer` provides methods for appending, inserting, deleting, and modifying the string.
    - Part of `java.lang` package, so it doesn't need an import.
    - It is recommended to use `StringBuffer` in scenarios where thread safety is needed, otherwise `StringBuilder` is more performant.
    */

    public static void main(String[] args) {

        // Creating a StringBuffer with the initial content "Hello"
        StringBuffer s1 = new StringBuffer("Hello");

        // Appending "World" to the existing content
        s1.append("World");
        System.out.println(s1);  // Output: HelloWorld

        // Additional StringBuffer operations

        // Deleting characters from index 1 to 2 (removes 'e')
        s1.delete(1, 2);
        System.out.println(s1);  // Output: HlloWorld

        // Deleting the character at index 1 (removes 'l')
        s1.deleteCharAt(1);
        System.out.println(s1);  // Output: HloWorld

        // Reversing the content
        s1.reverse();
        System.out.println(s1);  // Output: dlroWolH

        // Replacing the substring between index 0 and 2 with "Java"
        s1.replace(0, 2, "Java");
        System.out.println(s1);  // Output: JavaoWolH
    }
}
