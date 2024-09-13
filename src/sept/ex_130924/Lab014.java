package sept.ex_130924;

public class Lab014 {

    // Formatting in Java

    /*
    Formatting is a powerful feature in Java that allows you to control how data is presented.
    You can use format specifiers with methods like `System.out.printf()` or `String.format()` to achieve this.

    Format Specifiers:
    - %d: Used for integer values. It can represent byte, short, int, and long types.
    - %s: Used for strings. It can format any object as a string by calling its `toString()` method.
    - %c: Used for single characters.
    - %f: Used for floating-point numbers (float and double). You can also specify precision (e.g., %.2f for two decimal places).

    When using `System.out.printf()`:
    - The format string contains placeholders (`%d`, `%s`, etc.) for variables.
    - The placeholders are replaced with the corresponding arguments in the order they appear.

    When using concatenation:
    - The `+` operator joins strings with other data types.
    - The concatenation operation converts non-string types to strings and appends them to the existing string.

    Practical Uses:
    - Formatting is useful for creating readable output, especially for tables, reports, and logs.
    - Concatenation is often used for simple string building or when format requirements are minimal.

    Example:
    - `System.out.printf("%d * %d = %d%n", num, 1, num * 1);` prints `4 * 1 = 4`.
    - `System.out.println("The string is " + a + " and the number is " + num);` prints `The string is ABC and the number is 4`.
    */

    public static void main(String[] args) {
        // Example usage of formatting and concatenation
        int num = 4;
        String a = "ABC";

        // Using System.out.printf() for formatted output
        // %d is replaced by num, 1, and num * 1 respectively
        // %n represents a newline
        System.out.printf("%d * %d = %d%n", num, 1, num * 1); // Output: 4 * 1 = 4

        // Using concatenation to build the output string
        // + operator joins the strings and variables into one output string
        System.out.println("The string is " + a + " and the number is " + num); // Output: The string is ABC and the number is 4
    }
}

