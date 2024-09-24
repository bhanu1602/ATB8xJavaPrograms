package sept.ex_200924;

public class Lab037 {

    // Conditionals - Ternary Operator

    /*
     * The ternary operator is a shorthand way to write simple if-else statements.
     *
     * Syntax: (condition) ? expressionIfTrue : expressionIfFalse
     *
     * - If the condition evaluates to true, it returns the value of expressionIfTrue.
     * - If the condition evaluates to false, it returns the value of expressionIfFalse.
     *
     * It can only be used for simple, single-line expressions and is most useful for assigning
     * values based on a condition.
     *
     * Example: (30 > 40) ? 10 : 20;
     * This will return 20 because the condition (30 > 40) is false.
     */

    public static void main(String[] args) {

        // Using the ternary operator to assign a value based on a condition
        int a = (10 > 20) ? 20 : 10; // Since 10 is not greater than 20, a will be assigned the value 10.

        System.out.println(a); // Outputs: 10

        // Another example:
        int b = (30 < 40) ? 100 : 200; // Since 30 is less than 40, b will be assigned 100.

        System.out.println(b); // Outputs: 100
    }
}

