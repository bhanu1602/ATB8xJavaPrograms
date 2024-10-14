package Oct.ex_141024.AbstractInterface;

public class Lab105 {

    public static void main(String[] args) {
        A obj = new A(); // Creating an instance of class A
        obj.display();   // Calling the display method
    }
}

class A {
    // This class knows only that `d()` method will be called, but doesn't know its implementation details.

    void display() {
        // Creating a new instance of class B which implements the interfaces IA and IB
        // and calling method `d()`, which is implemented in class B
        new B().d();
    }
}

class B implements IA, IB {
    // Class B implements both interfaces IA and IB, so it has to provide the implementation of all their methods.

    @Override
    public void a() {
        // Implementation of method a() from interface IA
        System.out.println("Print a");
    }

    @Override
    public void b() {
        // Implementation of method b() from interface IA
        System.out.println("Print b");
    }

    @Override
    public void c() {
        // Implementation of method c() from interface IB
        System.out.println("Print c");
    }

    @Override
    public void d() {
        // Implementation of method d() from interface IB
        System.out.println("Print d");
    }
}

// Interface IA defines two abstract methods: a() and b()
interface IA {
    void a(); // abstract method a
    void b(); // abstract method b
}

// Interface IB defines two abstract methods: c() and d()
interface IB {
    void c(); // abstract method c
    void d(); // abstract method d
}

