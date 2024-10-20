package Oct.ex_161024.Static.Methods;

public class SimpleCalculator {

    // Static block to display a message when the class is loaded
    static {
        System.out.println("SimpleCalculator class loaded");
    }

    // Static method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Static method to subtract two integers
    static int subtract(int a, int b) {
        return a - b;
    }

    // Static method to multiply two integers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Static method to divide two integers with division by zero handling
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0.0; // Return 0.0 or handle as per requirement
        }
        return (double) a / b; // Cast to double for accurate division result
    }

    public static void main(String[] args) {
        // Calling static methods directly using the class name
        System.out.println("Addition: 1 + 2 = " + SimpleCalculator.add(1, 2));
        System.out.println("Subtraction: 2 - 3 = " + SimpleCalculator.subtract(2, 3));
        System.out.println("Multiplication: 2 * 3 = " + SimpleCalculator.multiply(2, 3));
        System.out.println("Division: 2 / 3 = " + SimpleCalculator.divide(2, 3));
        System.out.println("Division by zero: 2 / 0 = " + SimpleCalculator.divide(2, 0));
    }
}

