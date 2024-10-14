package Oct.ex_141024.ExampleInterface;

// Final version of Lab108 using Abstraction with Interfaces

// Interface defining abstract methods
interface IFather {
    // Abstract method: must be implemented by any class implementing IFather
    void f();

    // Concrete method: Java 8 and later allows default methods in interfaces
    default void loan() {
        System.out.println("The father took 500k loan");
    }
}

// Class Son implements the IFather interface
class Son implements IFather {

    // Implementing the abstract method from the IFather interface
    @Override
    public void f() {
        System.out.println("This should implement father's method from the interface");
    }
}

public class Lab108 {
    public static void main(String[] args) {
        // Creating an object of Son class
        Son son = new Son();

        // Calling the implemented method 'f()' from Son class
        son.f();

        // Calling the default method 'loan()' from IFather interface
        son.loan();
    }
}

