package Oct.ex_041024;

public class Lab88 {

    // Constructor
    /*
     * A constructor is a special method used to initialize objects. It is called automatically when an object is created.
     * The JVM allocates memory for the object when the constructor is called.
     * A constructor must have the same name as the class.
     * It does not have a return type, not even void.
     * A constructor is called only once, right after an object is instantiated using the "new" keyword.
     * Constructors cannot be abstract, final, static, or synchronized.
     * There are different types of constructors in Java:
     *
     * 1. Default Constructor: A constructor with no parameters. If no constructor is defined, Java provides a default constructor.
     * 2. Parameterized Constructor: Takes arguments to initialize object fields with specific values.
     * 3. Copy Constructor: Used to create an object by copying the state of another object.
     * 4. Constructor Overloading: More than one constructor is defined in a class with different parameter lists.
     * 5. 'this' keyword: Used to refer to the current object or to call another constructor in the same class.
     * 6. 'super' keyword: Used to call the constructor of the parent class. Even if not explicitly written, `super()` is automatically called.
     *
     * Additional Details:
     * - Constructor chaining: A constructor can call another constructor in the same class using `this()`. This must be the first statement in the constructor.
     * - Private constructor: A constructor can be declared private to prevent object creation from outside the class, useful in Singleton patterns.
     * - Static blocks vs constructors: Static blocks are used to initialize static variables and are executed once when the class is loaded, before any constructor is called.
     * - Final fields: If a class has final instance variables, they must be initialized either where they are declared or within a constructor.
     * - Best practice: Keep constructors simple. For heavy operations like file reading or network initialization, consider factory methods or dependency injection.
     * - Default constructor provides the default values to the object like 0, null, etc. depending on the type.
     */

    // Default constructor
    Lab88(){
        // This is a default constructor, no parameters are passed
        // It is automatically called when an object is created.
        // A common use of the constructor is to initialize resources like files, database connections, etc.
        System.out.println("This is the default constructor.");

        // Example of code that can be automatically executed when the object is created:
        // You can add logic here to read files, like reading a .txt, .csv, or Excel file upon object creation.


        // You can also add logic to handle CSV or Excel files using appropriate libraries.
        // For example, for CSV you could use OpenCSV, and for Excel files, you could use Apache POI.
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Creating an object of Lab_Cons class.
        // This will call the default constructor, which will automatically execute its code.
        Lab88 obj = new Lab88(); // Default constructor called when object is created.
    }
}

