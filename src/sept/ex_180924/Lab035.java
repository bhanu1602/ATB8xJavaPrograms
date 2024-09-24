package sept.ex_180924;

public class Lab035 {

    // Increment and Decrement Operators in Unary Operations

    /*
     * Increment Operator: Increases the value by 1
     * a) Post-increment: The value is first used in an expression, then incremented.
     *    Example: a++ (use a, then increment a by 1)
     * b) Pre-increment: The value is incremented first, then used in an expression.
     *    Example: ++a (increment a by 1, then use a)
     *
     * Decrement Operator: Decreases the value by 1
     * a) Post-decrement: The value is first used in an expression, then decremented.
     *    Example: b-- (use b, then decrement b by 1)
     * b) Pre-decrement: The value is decremented first, then used in an expression.
     *    Example: --b (decrement b by 1, then use b)
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        // Post-increment: The value of 'a' is printed first, then incremented.
        System.out.println("Post-increment: " + (a++));  // Output: 10 (then a becomes 11)

        // Pre-increment: 'a' is incremented first, then printed.
        System.out.println("Pre-increment: " + (++a));   // Output: 12 (a was already 11)

        // Post-decrement: The value of 'b' is printed first, then decremented.
        System.out.println("Post-decrement: " + (b--));  // Output: 10 (then b becomes 9)

        // Pre-decrement: 'b' is decremented first, then printed.
        System.out.println("Pre-decrement: " + (--b));   // Output: 8 (b was already 9)
    }
}
