package sept.ex_230924;

public class Lab052 {

    // From JDK13 it is introduced

    /*
     * Notes:
     * 1. **Switch Expressions (JDK 13)**:
     *    Starting from JDK 12 and fully introduced in JDK 13, switch statements have been enhanced
     *    with **switch expressions**. Switch can now return a value and has a more flexible syntax.
     *    For example, multiple case labels can be combined using commas, and you can use the new
     *    `yield` keyword to return values from a switch block.
     *
     *    Example of switch expression:
     *    ```java
     *    int result = switch (day) {
     *        case 1, 2, 3 -> 10;
     *        case 4 -> {
     *            int temp = someCalculation();
     *            yield temp + 10;
     *        }
     *        default -> 0;
     *    };
     *    ```
     *
     * 2. **Fall-through Behavior**: If a `break` is omitted, the switch case will fall through, meaning it
     *    will execute all subsequent cases until it finds a `break`. In JDK 13 and later, `switch`
     *    can handle multiple case labels in one line for better readability.
     *
     * 3. **Using Multiple Case Labels**: From JDK 12, you can use a comma to group case labels that share
     *    the same code, as shown below. This makes the code cleaner and avoids repetition of `case` blocks.
     *
     * 4. **New `yield` Keyword**: In JDK 13, the `yield` keyword allows returning values from a switch block
     *    (in place of returning from methods or using a traditional `break`).
     */

    public static void main(String[] args) {

        int itemCode = 003;

        // Traditional switch with grouped case labels
        switch (itemCode) {
            default:
                System.out.println("None");
                break;
            case 001, 002, 005:
                System.out.println("All of them are electronic");
                System.out.println("All of them are electronic");
                System.out.println("All of them are electronic");
                // No break, so fall-through to the next case
            case 004, 006, 007:
                System.out.println("This is mechanical");
                System.out.println("This is mechanical");
                System.out.println("This is mechanical");
                break;
        }
    }
}

