package sept.ex_230924;

public class Lab053 {

    // New way of writing switch (introduced in Java 12, enhanced in Java 14)

    /*
     * Notes:
     * 1. The "switch" expression can now use the arrow (->) syntax for concise, readable code.
     * 2. This removes the need for "break" statements since each case terminates automatically.
     * 3. Multiple labels (e.g., case 43, 44) can be combined in a single case block.
     * 4. This format reduces verbosity and makes the switch statement easier to manage.
     */

    public static void main(String[] args) {
        int itemCode = 44;

        switch (itemCode) {
            case 40 -> System.out.println("It is a laptop");
            case 42 -> System.out.println("It is a galaxy");
            case 43, 44 -> System.out.println("It is a human");
            default -> System.out.println("It is not a human");
        }
    }
}
