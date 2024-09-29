package sept.ex_250924;

public class Lab072 {

    // 'continue' in loop

    /*
    The continue statement is used to skip the current iteration of a loop
    and proceed to the next iteration.
    When the continue statement is executed, control jumps to the next
    iteration of the loop, bypassing any remaining code in the loop body
    for the current iteration.

    Key Points about the continue statement:
    - It can be used in for, while, and do-while loops.
    - It is useful for skipping certain values or conditions without
      terminating the entire loop.
    - Using continue can enhance the readability of the code by
      eliminating unnecessary nested if statements.
    - Be cautious with excessive use, as it can make the control flow
      harder to follow.
    */

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // Loop from 0 to 4
            System.out.println(i); // Print the current value of i
            if (i == 3) { // Check if i is equal to 3
                System.out.println(i); // Print i when it equals 3
                continue; // Skip the rest of the loop for this iteration
            }
            System.out.println("After"); // This line is skipped when i is 3
        }
    }
}

