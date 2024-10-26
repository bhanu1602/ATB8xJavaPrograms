package Oct.ex_231024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab131 {

    // throw vs throws

    /*
    Notes:

    1. **throw**:
       - The `throw` keyword is used to explicitly throw an exception from a method or a block of code.
       - You can throw either a checked or unchecked exception.
       - Once an exception is thrown using `throw`, the flow of the program transfers to the nearest enclosing `try-catch` block.

       Syntax:
       ```java
       throw new ExceptionType("Exception message");
       ```

    2. **throws**:
       - The `throws` keyword is used in the method signature to declare that a method may throw one or more exceptions.
       - It informs the caller of the method about the exceptions that might be thrown, and the caller should handle them.
       - Used with checked exceptions.

       Syntax:
       ```java
       public void methodName() throws ExceptionType1, ExceptionType2 {
           // method body
       }
       ```

    **Differences:**
    - `throw` is used within the method body to **throw** an exception explicitly, while `throws` is used in the method signature to **declare** exceptions.
    - `throw` can be used to throw a single exception at a time, whereas `throws` can declare multiple exceptions a method might throw.

    */

    // Example for throw
    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    // Example for throws
    public void fileRead() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("non_existent_file.txt");
    }

    public static void main(String[] args) {
        Lab131 obj = new Lab131();

        // Example of throw
        try {
            obj.checkAge(16);  // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Example of throws
        try {
            obj.fileRead();  // This will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught Exception: " + e);
        }
    }
}
