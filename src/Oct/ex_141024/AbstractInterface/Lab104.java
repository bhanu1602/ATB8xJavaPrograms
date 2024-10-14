package Oct.ex_141024.AbstractInterface;

public class Lab104 {

    // Abstraction using interfaces

    /*
    Interface

    1. `interface` is a keyword used to define user-defined data types.
    2. **Instance of an interface cannot be created directly**, but we can use classes that implement the interface.
    3. A class must use the `implements` keyword to inherit an interface.
    4. Interface can contain the following members:
       - public static final variables (constants)
       - public abstract methods (methods without a body, to be implemented by the class)
       - static inner classes (if required)
    5. **Default Methods**:
       - These are methods with a body that can be defined in the interface.
       - They allow us to add new functionality without breaking the existing code implementing the interface.
    */

    public static void main(String[] args) {

        // Creating an object of Pen which implements Interface
        Pen p = new Pen();

        // Calling the methods f1() and f2() that are implemented by the Pen class
        p.f1();
        p.f2();
    }

    // Class Pen implementing the Interface
    static class Pen implements MyInterface {

        @Override
        public void f1() { // Implementing the methods declared in MyInterface
            System.out.println("f1 method in Pen class");
        }

        @Override
        public void f2() {
            System.out.println("f2 method in Pen class");
        }
    }

    // Declaring the interface
    interface MyInterface {
        // Abstract methods (without body) that must be implemented by the class
        void f1();
        void f2();
    }
}

