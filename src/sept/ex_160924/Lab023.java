package sept.ex_160924;

public class Lab023 {

    // Unary Operators - need only one operand. They are used to increment, decrement, or negate a value.
    /*
     * Unary minus (-) - Used to negate values. Example: `int a = -5;`
     * Unary plus (+) - Although redundant, it can be used. When applied to types like
     *                 byte, char, or short, it auto-converts to int (called "unary promotion").
     *                 Example: `int a = +65;`
     *                 Example: byte x = 10; int result = +x; x is promoted to int before it performs operation
     */

    public static void main(String[] args) {

        int a = +65;  // unary plus (redundant but promotes type if needed)
        int b = -65; // unary minus (negates the value)

        System.out.println("Unary plus applied to a: " + a); // Output: 65
        System.out.println("Unary minus applied to b: " + b); // Output: -65
    }
}

