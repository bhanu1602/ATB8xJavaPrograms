package sept.ex_270924;

public class Lab078 {

    // do-while loop

    /*
    It is an exit control loop
    The loop will execute until the condition is true
    The loop will execute once even if the condition is false
    It checks the condition after executing the statements of the loop body
    Execution order: initialization -> body -> condition check -> increment/decrement

    Key points:
    - Ensures at least one execution of the loop, regardless of the condition
    - Useful when you want to execute code at least once and then check for continuation
    - The 'do-while' loop is less commonly used compared to 'while' and 'for' loops but is useful in specific scenarios
    - Condition is evaluated at the end, which differentiates it from 'while' and 'for' loops where the condition is checked before execution
    - Can be useful in menu-driven programs where the user is prompted at least once to input data before continuing
    - Ensure careful use to avoid infinite loops in cases where the exit condition is improperly set
    */

    public static void main(String[] args) {
        int a = 0;

        // Loop body will execute at least once
        do {
            System.out.println(a);
            a++; // Increment to avoid infinite loop
        } while (a < 0); // Condition checked after the loop body
    }
}

