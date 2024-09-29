package sept.ex_250924;

public class Lab076 {

    // using boolean in while loop

    /*
    The while loop can run based on a boolean condition. In this case,
    the loop runs indefinitely because the condition is always true.

    Key Points:
    - The condition of the while loop is a boolean expression.
    - If the boolean variable is `true`, the loop continues executing.
    - If the condition is never changed within the loop, it results in an infinite loop.
    - To avoid infinite loops, ensure the condition can eventually become false,
      or break the loop using `break` statements based on certain criteria.
    */

    public static void main(String[] args) {
        boolean t = true;  // A boolean variable set to true

        // Infinite loop because the condition is always true
        while (t) {
            System.out.println("Hi");
            // No update to t, so this loop will run forever printing "Hi"
        }
    }
}
