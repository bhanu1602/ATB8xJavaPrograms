package Oct.ex_231024;

public class Lab129 {

    // Multi-catch block (Java 7 and later)

    /*
    Notes:

    - **Multi-Catch Block (Java 7 and later)**:
      - Multiple exceptions can be caught in a single `catch` block using the pipe (`|`) symbol.
      - This allows cleaner code, especially if the handling of exceptions is the same.
      - The exceptions in a multi-catch block must not have a parent-child relationship (e.g., catching `Exception` and `RuntimeException` together is not allowed).

    - This example handles:
      - `NumberFormatException`: If the argument cannot be parsed to an integer.
      - `ArithmeticException`: If division by zero occurs.
      - `ArrayIndexOutOfBoundsException`: If no argument is provided.

    - The `throw` keyword is used to rethrow the exception or propagate it.
    */

    public static void main(String[] args) {
        try {
            String ip = args[0];  // ArrayIndexOutOfBoundsException possible
            int a = Integer.parseInt(args[0]);  // NumberFormatException possible
            int b = 10 / a;  // ArithmeticException possible (division by zero)
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);  // Rethrowing the exception
        }
    }
}

