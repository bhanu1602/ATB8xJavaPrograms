package Oct.ex_161024.Static.Blocks;

public class Lab108 {

    // Static Keyword Overview
    /*
    The static keyword is used for memory management and applies to the class level rather than instance level.
    Key points about static:
    - It is not an instance of a class; it belongs to the class itself.
    - It is a non-access modifier that can be applied to variables, methods, and nested classes.
    - Static variables are shared among all instances of a class.
    - They are loaded when the class is loaded by the class loader and can be accessed without creating an instance.
    - Static methods cannot access instance variables or methods directly (need an object reference).
    - Static members can be accessed using the class name (e.g., ClassName.staticMethod()).
    - Can be used with:
        - Blocks
        - Variables
        - Methods
        - Classes
    */

    // Instance Initialization Block (IIB)
    {
        System.out.println("Instance Initialization Block (IIB)");
        System.out.println("Code executed when an object of this class is created.");
        // You could perform operations like reading from a MySQL database here
    }

    // Static Initialization Block (SIB)
    static {
        System.out.println("Static Initialization Block (SIB)");
        System.out.println("Executed once when the class is loaded.");
        // Static initialization blocks are useful for setting up static resources.
    }

    // Main method to demonstrate the execution of static and instance blocks
    public static void main(String[] args) {
        System.out.println("Main method execution started.");

        // Creating an instance of Lab108, which will invoke the IIB
        Lab108 lab = new Lab108();

        // Creating another instance to demonstrate that IIB runs each time an object is created
        Lab108 anotherLab = new Lab108();

        System.out.println("Main method execution ended.");
    }

    // Additional Notes:
    /*
    - If a class has multiple static blocks, they will be executed in the order they appear in the code.
    - IIBs can also be used for initializing instance variables that require more complex logic.
    - Static members (variables and methods) can be useful for defining constants or utility methods that do not require an instance of the class.
    - Static blocks can also be used to initialize static variables that may need a more complex setup than a simple assignment.
    - Caution: Overusing static members can lead to tight coupling and make testing difficult, so they should be used judiciously.
    */
}

