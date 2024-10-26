package Oct.ex_231024;

public class Lab132 {

    // Custom Exceptions

    /*
    Notes:

    1. A **custom exception** is a user-defined exception, created by extending the `Exception` class or `RuntimeException` class.
    2. It allows you to define application-specific error conditions and handle them in a controlled manner.
    3. Extending `Exception` creates a **checked exception**, while extending `RuntimeException` creates an **unchecked exception**.
    4. Custom exceptions provide more meaningful error messages, improving the readability and debugging process.

    Syntax:
    ```java
    public class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
    ```

    */

    // Example of a custom checked exception
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message); // Passes the message to the Exception class constructor
        }
    }

    // Example method to check age using the custom exception
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("Age is valid. Eligible.");
        }
    }

    public static void main(String[] args) {
        Lab132 obj = new Lab132();

        // Handling the custom exception
        try {
            obj.checkAge(16); // This will throw the custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

