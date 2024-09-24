package sept.ex_200924;

public class Lab042 {

    // Conditionals
    /*
     * if-else condition
     * Syntax:
     * if (condition) {
     *    // Code executed if condition is true
     * } else {
     *    // Code executed if condition is false
     * }
     *
     * - You can add multiple `else if` blocks to check for additional conditions.
     * - Java evaluates conditions from top to bottom and executes the first block that is true.
     * - If none of the conditions are true, the `else` block (if present) will execute.
     */

    public static void main(String[] args) {
        int age = 13;

        if (age >= 18) {
            System.out.println("Allowed to vote");
        } else if (age >= 16 && age < 18) {
            System.out.println("Can drive with a learner's permit");
        } else {
            System.out.println("Not allowed to vote or drive");
        }

        // Additional example: checking for negative, zero, or positive number
        int number = -5;
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }
    }
}

