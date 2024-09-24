package sept.ex_200924;

public class Lab043 {
    // Using boolean in if-else

    /*
     * A boolean variable can be used in if-else statements to control the flow of execution.
     * - The condition inside the if statement must evaluate to true or false.
     * - The logical NOT operator (!) can be used to invert the boolean value.
     */

    public static void main(String[] args) {
        boolean b = !true; // Corrected 'booleab' to 'boolean' and initialized 'b' to false

        if (b) {
            System.out.println("B is true");
        } else {
            System.out.println("B is not true"); // Added missing semicolon
        }
    }
}

