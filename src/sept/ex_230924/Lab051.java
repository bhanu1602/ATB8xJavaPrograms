package sept.ex_230924;

public class Lab051 {

    /*
     * Key Notes:
     * 1. The value in each `case` must be a **constant** or **literal**. This is because
     *    the switch statement compares the value passed to the switch expression at
     *    compile time, so dynamic or variable values are not allowed.
     *
     *    Example:
     *    ```java
     *    char ch = 'A';
     *    switch(ch) {
     *        case 'A':
     *           // valid, because 'A' is a constant
     *    }
     *    ```
     *
     * 2. `break` cannot be used within an `if-else` statement. The `break` is used in switch cases
     *    to exit the `switch` block once a matching case is found and executed. If omitted,
     *    the program will execute all subsequent cases until it encounters a `break` or the end
     *    of the switch block (this is called "fall-through").
     *
     * 3. **Switch with Primitives**: Starting from JDK 7, switch can work with `String` in addition
     *    to primitive types such as `int`, `byte`, `short`, `char`. It doesn't support `boolean`,
     *    `float`, `double`, or `long` directly in `switch` statements.
     *
     * 4. **Type Casting in Switch**:
     *    - To use a `long` in a `switch` statement, it must be **type-cast** to an `int` as shown below:
     *    ```java
     *    long a11 = 30L;
     *    switch ((int) a11) {
     *        case 30:
     *           // This works after casting long to int
     *    }
     *    ```
     */

    public static void main(String[] args) {

        // Switch with char
        char ch = 'A';
        switch (ch) {
            case 'A':
                System.out.println("The character is A");
                break;
            case 'B':
                System.out.println("The character is B");
                break;
            default:
                System.out.println("Unknown character");
        }

        // Switch with boolean (not allowed, will cause a compile error)
        // boolean b = true;
        // switch (b) {
        //     case true:
        //         System.out.println("True");
        //     case false:
        //         System.out.println("False");
        // }

        // Switch with long (long type must be cast to int for switch case)
        long a11 = 30L;
        switch ((int) a11) {
            case 30:
                System.out.println("Casted long to int, value is 30");
                break;
            default:
                System.out.println("Other value");
        }
    }
}
