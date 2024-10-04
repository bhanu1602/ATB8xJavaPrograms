package Oct.ex_041024;

public class Lab89 {

    String name;

    // Parameterized constructor
    /*
     * A parameterized constructor is used to initialize instance variables (fields) with specific values provided at object creation.
     * Unlike the default constructor, it takes arguments and uses them to set the state of the object.
     *
     * Key points about parameterized constructors:
     * 1. Parameterized constructors allow you to set initial values for object fields when the object is created.
     * 2. A constructor does not have a return type, but it implicitly returns the current instance of the class (i.e., `this`).
     * 3. You can use `this` keyword to differentiate between instance variables and parameters with the same name.
     * 4. The `this` keyword can also be used to invoke other constructors within the same class (constructor chaining).
     * 5. You can write a `return` statement in a constructor, but it cannot return a value. The `return` is used only to exit early from the constructor.
     *
     * Additional points:
     * - If you don’t define any constructor in a class, Java provides a default constructor with no arguments. However, once you define any constructor, including a parameterized one, the default constructor is no longer provided.
     * - Parameterized constructors can be overloaded, meaning multiple constructors can exist with different parameter types or numbers.
     * - Memory for the object is allocated when the constructor is invoked, and the object is garbage collected when there are no more references to it.
     * - Constructors are not inherited by subclasses, but a subclass can call the parent class constructor using `super()`.
     */

    // Parameterized constructor to initialize the 'name' field
    Lab89(String name){
        this.name = name;  // `this.name` refers to the instance variable; `name` refers to the parameter
        System.out.println("This is a parameterized constructor, and the name is: " + this.name);
    }

    public static void main(String[] args) {
        // Creating an object of Lab89 and passing a value to the parameterized constructor
        Lab89 obj = new Lab89("Sam"); // Calls the parameterized constructor
        // The reference `obj` is pointing to the memory allocated for this object.
        // When `obj` is no longer referenced, the object is eligible for garbage collection.
    }
}

