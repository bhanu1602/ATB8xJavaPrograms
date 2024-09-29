package sept.ex_270924;

public class Lab080 {

    /*
    The do-while loop must return a boolean condition; otherwise, it results in a compile-time error.

    Key points:
    - In this example, the loop condition (i >= 3) evaluates to false on the first iteration, but since it's a do-while loop, the body will execute at least once.
    - The loop body is a single statement here, so curly braces are not mandatory.
    - If you add multiple statements within the loop body, it's recommended to use curly braces to group them properly.
    - The condition in the "while" part must always result in a boolean value; otherwise, a compile-time error will occur.
    - Common mistake: Forgetting that the loop executes at least once, which could lead to unexpected behavior if not handled properly.
    */

    public static void main(String[] args) {

        // without curly braces for a single statement in the loop body
        int i = 1;

        // Loop body executes once before checking the condition
        do
            System.out.println("Hello");  // This will print once even though the condition is false
        while (i >= 3);  // Condition is false (1 >= 3), so the loop terminates after one execution
    }
}

