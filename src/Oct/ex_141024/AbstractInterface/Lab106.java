package Oct.ex_141024.AbstractInterface;

public class Lab106 extends I1.AA implements I1 {

    @Override
    public void stop() {
        System.out.println("Stop method implementation");
    }

    @Override
    public void car() {
        System.out.println("Car method implementation");
    }

    @Override
    void f2() {
        System.out.println("Abstract method f2 implementation in Lab106");
    }

    public static void main(String[] args) {
        Lab106 lab = new Lab106();

        // Calling default method from the interface
        lab.start();

        // Calling static method from the interface
        I1.drive();

        // Calling inherited method from abstract class AA
        lab.f1();

        // Calling overridden abstract method from class AA
        lab.f2();

        // Calling interface methods
        lab.car();
        lab.stop();
    }
}

interface I1 {
    // Default method in interface (allowed to have a body)
    default void start() {
        System.out.println("Default method implementation from Interface I1");
    }

    // Abstract methods that need to be implemented
    void stop();
    void car();

    // Static method in the interface (allowed to have a body)
    static void drive() {
        System.out.println("Static method in Interface I1");
    }

    // Abstract class inside interface
    abstract class AA {
        // Concrete method inside the abstract class
        void f1() {
            System.out.println("Concrete method f1 from abstract class AA");
        }

        // Abstract method that must be implemented by subclass
        abstract void f2();

        // Static method inside the abstract class (with body)
        static void f3() {
            System.out.println("Static method f3 from abstract class AA");
        }
    }
}

