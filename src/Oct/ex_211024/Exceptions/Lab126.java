package Oct.ex_211024.Exceptions;
public class Lab126 {
    // Exceptions in Java

    /*
    Notes

    - Exceptions occur during program execution that disrupt the normal flow of the program.
    - If they are not handled, control will be passed to the JVM, which may terminate the program abnormally.

    **Error vs Exception:**
    - **Error**: Represents serious issues that applications should not try to handle (e.g., OutOfMemoryError).
    - **Exception**: Represents conditions that a program might want to catch and handle (e.g., FileNotFoundException).

    **Types of Exceptions:**

    1. **Built-in Exceptions**:
       - **Checked Exception**: These are exceptions that are checked at compile-time (e.g., IOException).
       - **Unchecked Exception**: These are exceptions that are not checked at compile-time but occur at runtime (e.g., ArithmeticException, NullPointerException).

    2. **User-Defined Exceptions**:
       - Developers can define custom exceptions by extending the `Exception` class or `RuntimeException`.

    **Handling Exceptions**:
    - Java provides the following keywords to handle exceptions:
      - **try**: Encloses the code that might throw an exception.
      - **catch**: Catches and handles exceptions.
      - **finally**: Executes code regardless of whether an exception is thrown.
      - **throw**: Used to explicitly throw an exception.
      - **throws**: Declares exceptions that a method can throw.
    */

    // Example of a checked exception
    public static void main(String[] args) {
        try {
            // Code that may throw a checked exception
            Thread.sleep(1000);  // InterruptedException (checked exception)
            System.out.println("Checked Exception handled using try-catch.");
        } catch (InterruptedException e) {
            // Handle the checked exception
            System.out.println("Caught InterruptedException: " + e.getMessage());
        }

        // Example of an unchecked exception
        try {
            int result = 10 / 0;  // ArithmeticException (unchecked exception)
        } catch (ArithmeticException e) {
            // Handle the unchecked exception
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

    }
}



