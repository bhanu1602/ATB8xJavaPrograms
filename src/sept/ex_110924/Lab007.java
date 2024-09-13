package sept.ex_110924;

public class Lab007 {

    // Data Types

    // Primitive Data Types

    /* Boolean Data Type:
     * - Stores only two possible values: true or false.
     * - Default value is false, meaning that if a boolean variable is not explicitly initialized, it will automatically have the value false.
     * - Takes up 1 bit of memory conceptually, but in practice, it is often stored as a byte (8 bits) due to memory alignment and storage efficiency considerations.
     * - Used primarily in control flow statements (if, while, for) and logical operations.
     * - Can be used to represent binary states such as on/off, true/false, yes/no.
     * - Boolean expressions are fundamental in decision-making and branching logic.
     * - Examples:
     *   - `boolean isActive = true;` // Variable 'isActive' is initialized to true.
     *   - `boolean isFinished = false;` // Variable 'isFinished' is initialized to false.
     * - It can be used in loops to control the loop execution.
     *   - Example:
     *     boolean continueLoop = true;
     *     while (continueLoop) {
     *         // Perform actions
     *         continueLoop = false; // Loop will terminate after one iteration
     *     }
     * - Used in logical operations:
     *   - Example:
     *     boolean isSunny = true;
     *     boolean isWeekend = false;
     *     boolean shouldGoOut = isSunny && isWeekend; // true only if both conditions are true
     * - Default value:
     *   - Example:
     *     boolean[] flags = new boolean[5]; // Array of 5 boolean values, all initialized to false.
     * - Used in arrays:
     *   - Example:
     *     boolean[] flagArray = {true, false, true, false}; // Array with specific boolean values.
     */


    public static void main(String[] args) {
        boolean male = true; // Variable 'male' is declared and initialized with the value 'true'.

        // Execution:
        // - Memory for the boolean variable 'male' is allocated when the 'main' method is executed.
        // - The value 'true' is stored in memory.
        // - The boolean value can be changed during execution if needed.

        System.out.println(male); // Prints the value of 'male' to the console.

        // Call the method to demonstrate boolean return value
        System.out.println(ismale()); // Outputs the boolean value returned by the ismale() method.
    }

    public static boolean ismale() {
        // Method returns a boolean value.
        // The method 'ismale()' is static and thus can be called without creating an instance of the class.
        // Execution:
        // - This method returns 'true', which is a boolean literal.
        // - The return value is then printed to the console in the main method.
        return true;
    }
}

