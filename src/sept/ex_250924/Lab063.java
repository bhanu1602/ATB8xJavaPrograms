package sept.ex_250924;

public class Lab063 {

    // Demonstrating the use of boolean and different forms of for loops.

    /*
    Notes:
    1. **Using boolean in a for loop**:
       - The test condition can be a boolean value. If the boolean value is `true`, the loop will execute indefinitely.
       - In the first loop, since `b` is `true` and marked as `final` (cannot be changed), the loop runs infinitely, printing "hello" endlessly.

    2. **Using `final` with a boolean**:
       - If a variable is marked as `final`, it cannot be reassigned. So the line `b = false;` will result in a compilation error if uncommented.

    3. **For loop without update or test condition**:
       - In the second loop, the test condition is omitted, leading to an infinite loop.
       - In the third loop, both the initialization and test condition are omitted, resulting in another infinite loop.

    4. **Infinite loops**:
       - Without a condition to break the loop, both `for (int k = 0; ; )` and `for ( ; ; )` will run indefinitely, continuously printing "Hello".
       - These types of loops are useful in cases where you want continuous execution (like a server process), but typically require a manual exit condition (`break;` or external stop).
    */

    public static void main(String[] args) {
        final boolean b = true; // b is marked final and cannot be changed

        // Infinite loop because b is always true
        for (int i = 0; b; i++) {
            System.out.println("hello"); // Prints "hello" infinitely
        }

       /* // Infinite loop with no test condition
        for (int k = 0; ; ) {
            System.out.println("Hello"); // Prints "Hello" infinitely
        }

        // Infinite loop with completely empty for loop syntax
        for ( ; ; ) {
            System.out.println("Hello"); // Prints "Hello" infinitely
        }*/


    }
}

