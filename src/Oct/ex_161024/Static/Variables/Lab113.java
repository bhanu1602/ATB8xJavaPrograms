package Oct.ex_161024.Static.Variables;

public class Lab113 {

    // Static variables
    /*
    When a variable is declared as static, it creates a single copy shared among all instances of the class.
    Static variables act like global variables within the scope of the class.
    They can only be created at the class level.
    Static blocks and static variables are executed in the order they are declared.
    */

    // Example for static variables
    static int a = 20; // Static variable initialized to 20
    static int b = method(); // Static variable initialized by calling the static method

    // Static block executed when the class is loaded
    static {
        System.out.println("Inside static block");
    }

    // Static method to initialize variable b
    static int method() {
        return 30; // Returns the value 30
    }

    public static void main(String[] args) {
        System.out.println("Inside main"); // Indicate the main method has started
        System.out.println("The value of b: " + b + ", and the value of a: " + a); // Print the values of a and b
    }
}
