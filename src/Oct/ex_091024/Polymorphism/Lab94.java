package Oct.ex_091024.Polymorphism;

class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Lab94 {

    // Method Overloading

    /*
    Notes:
    - Method overloading allows multiple methods in the same class to have the same name but with different parameters (different types, number of parameters, or both).
    - The method signatures must be different for each overloaded method.
    - In this example, the `add` method is overloaded with:
      1. Two parameters of type `int`.
      2. Three parameters of type `int`.
      3. Two parameters of type `double`.
    - Overloading improves code readability and allows flexible method usage based on the input type or number of arguments.
    */

    public static void main(String[] args) {

        // Creating a Calculator object
        Calculator calc = new Calculator();

        // Calling overloaded add methods
        System.out.println("Sum of two integers: " + calc.add(5, 10));         // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));    // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));       // Calls add(double, double)
    }
}
