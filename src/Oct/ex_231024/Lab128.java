package Oct.ex_231024;

public class Lab128 {

    // Handling multiple exceptions using multiple catch blocks

    /*
    Notes:

    - **Multiple Catch Blocks**:
      - You can catch different exceptions that might arise from different parts of a `try` block.
      - Each `catch` block is responsible for handling a specific type of exception.
      - The order of catch blocks matters: Java looks for the first matching exception type.
      - **From Java 7**, you can use multi-catch (catching multiple exceptions in one block) using the pipe (`|`) symbol.

    - In this example:
      - `NumberFormatException`: Occurs if the program cannot parse a number (e.g., passing a non-integer string).
      - `ArithmeticException`: Occurs if there's an arithmetic issue (e.g., dividing by zero).
      - `ArrayIndexOutOfBoundsException`: Occurs if you try to access an invalid index in an array (e.g., if no argument is passed).

    */

    public static void main(String[] args) {
        try {
            String abc = args[0];  // Potential ArrayIndexOutOfBoundsException if args is empty
            int a = Integer.parseInt(args[0]);  // Potential NumberFormatException
            int b = 10 / a;  // Potential ArithmeticException (e.g., divide by zero)
        } catch (NumberFormatException e) {
            System.out.println("Number format issue: " + e);
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic issue (possibly division by zero): " + e);
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
            e.printStackTrace();
        }
    }
}

