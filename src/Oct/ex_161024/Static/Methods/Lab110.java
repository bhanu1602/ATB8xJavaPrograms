package Oct.ex_161024.Static.Methods;

public class Lab110 {

    // With static methods

    /*
    Static Method Characteristics:
    - Declared with the `static` keyword.
    - Can be accessed without creating an instance of the class.

    Restrictions for static methods:
    - Can only directly call other static methods within the same class.
    - Can directly access static data (variables).
    - Cannot use the `this` or `super` keywords because they are not associated with any specific instance.
    */

    // Instance variable (non-static)
    int a = 10; // This variable cannot be accessed directly in static methods

    // Static variable
    static int b = 20; // This variable can be accessed directly in static methods

    // Static method
    static void add() {
        System.out.println("This is a static method");
        // a = 10; // Uncommenting this line would cause a compile error: non-static field cannot be accessed in a static method
        b = 25; // Accessing and modifying the static variable
        System.out.println("Accessed static member: " + b);
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        add(); // Calling the static method without creating an instance
    }
}

