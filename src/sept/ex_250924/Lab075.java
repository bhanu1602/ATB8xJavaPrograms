package sept.ex_250924;

public class Lab075 {

    // while loop - it executes until the boolean condition is satisfied

    /*
    The while loop is a control flow statement that repeats a block of code
    as long as the specified boolean condition remains true.

    Key Points about while loop:
    - It checks the condition before executing the loop body (entry-controlled loop).
    - If the condition is true, the loop body executes; otherwise, the loop terminates.
    - The loop may never execute if the condition is false at the start.
    - It is equivalent to repeatedly checking an if statement.
    - Be careful with infinite loops if the condition never turns false.

    Syntax:
    while(condition) {
        // Code block
    }
    */

    public static void main(String[] args) {

        int i = 0;
        while(i <= 10){ // Loop will execute as long as i <= 10
            System.out.println(i);  // Print the value of i
            i++; // Increment i by 1 after each iteration
        }
    }
}

