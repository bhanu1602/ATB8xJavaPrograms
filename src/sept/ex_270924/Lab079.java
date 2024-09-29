package sept.ex_270924;

public class Lab079 {

    // do-while loop example with age validation

    /*
    Key points:
    - This example demonstrates a do-while loop where the condition checks if the age is greater than 18.
    - The loop body executes once, even though the condition (age > 18) is initially false.
    - The "do" block runs first, printing the message before evaluating the condition.
    - In this case, the loop will terminate after the first iteration because the condition will remain false (age starts at 17).
    - Care should be taken with do-while loops since they always execute at least once, which could lead to unintended behavior if not properly handled.
    */

    public static void main(String[] args) {
        int age = 17;

        // Loop body will execute at least once even though the condition is false
        do {
            System.out.println("Can vote " + age);  // Prints the age even if age < 18
            age++;  // Incrementing age
        } while (age > 18); // This condition is false, so the loop exits after first iteration
    }
}

