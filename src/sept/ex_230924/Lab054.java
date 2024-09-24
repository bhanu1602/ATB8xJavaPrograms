package sept.ex_230924;

public class Lab054 {

    // It accepts negative values as case labels

    /*
     * Notes:
     * 1. A `switch` statement in Java can accept negative values as case labels, just like positive integers.
     * 2. The order of the case blocks doesn't affect execution as the switch jumps directly to the matching case.
     * 3. If no case matches, the `default` case is executed.
     * 4. The absence of `break` statements leads to fall-through behavior, meaning execution will continue to the next case if no break is encountered.
     */

    public static void main(String[] args) {

        int a = 11;

        switch (-1) {
            case 11:
                System.out.println("10");
                break;
            default:
                System.out.println("Default");
            case -1:
                System.out.println("10"); // This case is executed, as -1 matches the switch value.
        }
    }
}


