package sept.ex_250924;

public class Lab062 {

    // Demonstrating another way of writing a for loop without a test condition.

    /*
    Notes:
    1. The test condition in a `for` loop is optional.
    2. If no test condition is provided, the loop will continue indefinitely, leading to an infinite loop unless there is a break condition or the program is terminated.
    3. In this example, the loop will run infinitely because there is no condition to control the number of iterations.
    4. The only way to stop this loop is by manually breaking it (using `break;`) or terminating the program.
    */

    public static void main(String[] args) {
        // The for loop here has no test condition (between the two semicolons).
        // This results in an infinite loop, as there is no condition to stop it.
        for (int k = 0; ; k++) { // Infinite loop since no test condition is provided
            System.out.println(k); // This will keep printing values of 'k' starting from 0 and incrementing
        }
    }
}



