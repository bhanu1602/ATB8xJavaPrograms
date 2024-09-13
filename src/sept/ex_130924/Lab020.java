package sept.ex_130924;

public class Lab020 {

    // Constants

    /*
     * Constants:
     * - Constants are variables whose values cannot be changed once assigned.
     * - In Java, constants are declared using the `final` keyword.
     * - A `final` variable can be assigned a value only once.
     * - Constants are typically declared in all uppercase letters with underscores separating words for readability.
     * - Example: final int MAX_SPEED = 120;
     *
     * Usage:
     * - Constants are used when you want to ensure that certain values remain unchanged throughout the program.
     * - They provide clarity and prevent accidental modifications.
     * - Constants can improve code readability, especially when working with values that are referenced multiple times.
     *
     * Best practices:
     * - Always name constants in uppercase to differentiate them from regular variables.
     * - Use constants to replace hard-coded values for maintainability.
     */

    // Example of constants
    public static final int MAX_SPEED = 120;     // A constant representing the maximum speed
    public static final double PI = 3.14159;     // A constant representing the value of Pi

    public static void main(String[] args) {
        // The value of MAX_SPEED and PI cannot be changed during program execution
        System.out.println("Max Speed: " + MAX_SPEED);
        System.out.println("Value of Pi: " + PI);

        // Uncommenting the following line would result in a compilation error, as constants cannot be reassigned:
        // MAX_SPEED = 130;  // Error: cannot assign a value to final variable MAX_SPEED
    }
}

