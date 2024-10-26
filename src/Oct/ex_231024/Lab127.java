package Oct.ex_231024;

public class Lab127 {

    // Execution Flow for Exception Handling

    /*
    Notes:

    - **JVM calls main method**: The execution of a Java program starts with the `main` method.

    - **Normal Flow**: If no exception occurs, the program runs normally, and any `try-catch` block is skipped.

    - **Exception Flow**:
      - If an exception occurs within the `try` block, an exception object is created.
      - The control is passed to the `catch` block to handle the exception.
      - If no matching `catch` block is found, the exception is propagated up the call stack, potentially causing the program to terminate abnormally if not handled.

    - **Throwable in Catch Block**: `Throwable` is the superclass for all errors and exceptions. You can catch any kind of exception by using `Throwable`, though it's not a common practice for standard code.

    - **String in Catch**: Using `String` in a `catch` block is incorrect because `catch` expects an exception object, not a data type like `String`.
    */

    public static void main(String[] args) {
        // Simulating an exception flow with null value
        String name = null;

        try {
            // This will throw a NullPointerException because `name` is null
            name.trim();
        } catch (Exception e) {
            // Catches any exception and prints the details
            System.out.println("Exception caught: " + e);

            // Optionally rethrowing the caught exception wrapped in a RuntimeException
            throw new RuntimeException(e);
        }
    }
}

