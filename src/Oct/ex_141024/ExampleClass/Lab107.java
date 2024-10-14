package Oct.ex_141024.ExampleClass;

abstract class Father {

    // Abstract method: must be implemented by any subclass of Father
    abstract void f();

    // Concrete method: can be used directly by subclasses
    void loan() {
        System.out.println("The father took 500k loan");
    }
}

class Son extends Father {

    // Implementing the abstract method from the abstract class Father
    @Override
    void f() {
        System.out.println("This should implement father's abstract method");
    }
}

public class Lab107 {
    public static void main(String[] args) {
        // Creating an object of subclass Son
        Son son = new Son();

        // Calling the implemented method 'f()' from Son class
        son.f();

        // Calling the inherited concrete method 'loan()' from Father class
        son.loan();
    }
}
