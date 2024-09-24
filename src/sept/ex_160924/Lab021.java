package sept.ex_160924;

public class Lab021 {

    // Operators are symbols used to perform operations on variables.
    /*
     * There are three types of operators:
     * 1. Unary operator - Requires one operand.
     *    Example: Increment (++) or Decrement (--)
     * 2. Binary operator - Requires two operands.
     *    Example: Addition (+), Subtraction (-), Multiplication (*), Division (/)
     * 3. Ternary operator - Requires three operands.
     *    Example: Conditional Operator (condition ? expr1 : expr2)
     */

    /*
     * Arithmetic operators are used to perform mathematical operations such as:
     * A) Unary arithmetic: Operators like Increment (++) and Decrement (--)
     * B) Binary arithmetic: Operators like +, -, *, /, %
     */

    // Example of Binary arithmetic operators in action:

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Performing arithmetic operations and printing the result.
        System.out.println("Addition: " + (a + b)); // Adds two numbers (a + b)
        System.out.println("Subtraction: " + (a - b)); // Subtracts b from a (a - b)
        System.out.println("Division: " + (a / b)); // Divides a by b (a / b)
        System.out.println("Multiplication: " + (a * b)); // Multiplies a by b (a * b)
        System.out.println("Modulus: " + (a % b)); // Finds the remainder when a is divided by b (a % b)

    }
}

