package Oct.ex_141024;

public class Lab102 {

    // Abstraction

    /*
    Abstraction is the concept of hiding the internal implementation details and showing only the essential features or functionalities.
    It can be achieved in two ways:
    a) Abstract Class
    b) Interface (Pure Abstraction)
    */

    /*
    Abstract Class

    1. **Abstract is the keyword**:
       - Used to define abstract classes or methods.
       - Abstract means incomplete; an abstract class may contain incomplete (abstract) methods that must be implemented by subclasses.

    2. **Concrete vs Abstract Methods**:
       - An abstract method is a method that is declared without implementation.
       - A concrete method is a method with an implementation.
       - If a class contains at least one abstract method, it must be declared abstract.

    3. **Concrete Class**:
       - A class that does not have any abstract methods is called a concrete class.

    4. **Instantiation**:
       - An abstract class **cannot be instantiated** directly. You need to extend it and provide concrete implementations for the abstract methods in a subclass.

    5. **Access Modifiers with Abstract Methods**:
       - Abstract methods **cannot be private**, **cannot be final**, **cannot be static**, and **cannot be synchronized**.

    6. **Inheritance**:
       - Abstract classes are meant to be extended by other classes. Any subclass that extends an abstract class must implement all of its abstract methods, unless the subclass is also declared abstract.
    */

    // Example of an Abstract Class
    abstract class Loan {
        // Abstract method (no implementation)
        abstract void loan(); // Any subclass must implement this method

        // Concrete method (has an implementation)
        void loan1() {
            System.out.println("You got a loan");
        }
    }

    // Concrete classes (no abstract methods)
    class Student1 {
        // Implementation for Student1 (example of a concrete class)
    }

    class Student2 {
        // Implementation for Student2 (example of a concrete class)
    }

    class Student3 {
        // Implementation for Student3 (example of a concrete class)
    }


}

