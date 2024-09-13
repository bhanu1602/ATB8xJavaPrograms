package sept.ex_130924;

public class Lab015 {

    public static void main(String[] args) {
        // Define string variables for name and last name
        String name = "Bhanu";
        String lastName = "Prasad";

        // Using printf for formatted output
        // %s is a format specifier that will be replaced by the string values of 'name' and 'lastName'
        // The formatted string will be printed to the console
        System.out.printf("Your name is %s and last name is %s", name, lastName);

        /*
         * Notes:
         * 1. `printf` Method:
         *    - `System.out.printf` is used for formatted output in Java.
         *    - It allows embedding format specifiers within a string.
         *    - The method takes a format string and one or more arguments to replace the format specifiers.
         *
         * 2. Format Specifiers:
         *    - `%s` : Format specifier for strings. It replaces `%s` with the provided string argument.
         *    - `%d` : Format specifier for integers.
         *    - `%f` : Format specifier for floating-point numbers.
         *    - `%c` : Format specifier for characters.
         *
         * 3. Advantages of Formatting:
         *    - Provides precise control over the output format.
         *    - Useful for aligning text, formatting numbers, and creating consistent output.
         *
         * 4. Example:
         *    - Given the format string "Your name is %s and last name is %s", and arguments "Bhanu" and "Prasad",
         *      the `printf` method will output: "Your name is Bhanu and last name is Prasad".
         *
         * 5. Alternative:
         *    - String concatenation using `+` operator can be used but is less flexible compared to `printf`.
         */
    }
}
