package sept.ex_090924;

public class Lab006 {

    // Variables and Identifiers

    /*
     * A variable is a container used to store/hold data.
     * Each variable must have a unique name (identifier).
     * Memory will be allocated to a variable during the program's execution.
     *
     * Two types of variables:
     * a) Primitive variables:
     *    - Declared with primitive data types (e.g., int, boolean, char).
     *    - Example: int a = 10;
     *    - Primitive data types include:
     *      - byte (8 bits): Range from -128 to 127.
     *      - short (16 bits): Range from -32,768 to 32,767.
     *      - int (32 bits): Range from -2^31 to 2^31-1.
     *      - long (64 bits): Range from -2^63 to 2^63-1.
     *      - float (32 bits): For floating-point numbers with single precision.
     *      - double (64 bits): For floating-point numbers with double precision.
     *      - char (16 bits): Represents a single Unicode character.
     *      - boolean (1 bit): Represents true/false values.
     *    - Execution:
     *      - Memory is directly allocated based on the size of the data type (e.g., 4 bytes for `int`).
     *      - Values are stored directly in the allocated space.
     * b) Reference variables:
     *    - Declared with user-defined data types (e.g., classes, arrays).
     *    - Example: String str = "Hi";
     *    - Reference variables store references to objects, not the actual data.
     *    - They can point to objects of classes, arrays, or interfaces.
     *    - Execution:
     *      - Memory allocation involves two parts: the reference variable itself (in stack memory) and the actual object it points to (in heap memory).
     *      - Reference variables store the memory address (reference) of the object rather than the object data itself.
     */

    /*
     * Based on scope, variables are divided into three types:
     * 1. Local Variables:
     *    - Declared inside a method or block.
     *    - Must be initialized before use.
     *    - Limited to the scope of the method or block in which they are declared.
     *    - Example:
     *      public void myMethod() {
     *          int localVar = 10; // Local variable
     *      }
     *    - Execution:
     *      - Memory is allocated when the method or block is executed.
     *      - Local variables are destroyed when the method or block completes.
     * 2. Instance Variables:
     *    - Declared in the class but outside any method.
     *    - Memory is allocated when an object is created.
     *    - Retain their values as long as the object exists.
     *    - Each object has its own copy of instance variables.
     *    - Example:
     *      public class MyClass {
     *          int instanceVar = 20; // Instance variable
     *      }
     *    - Execution:
     *      - Memory is allocated when the object is instantiated.
     *      - Instance variables are destroyed when the object is garbage collected.
     * 3. Class (Static) Variables:
     *    - Declared using the `static` keyword.
     *    - Shared among all instances of the class.
     *    - Memory is allocated when the class is loaded.
     *    - Can be accessed using the class name or through an object reference.
     *    - Example:
     *      public class MyClass {
     *          static int staticVar = 30; // Static variable
     *      }
     *    - Execution:
     *      - Memory is allocated when the class is loaded by the JVM.
     *      - Static variables are shared across all instances of the class and remain as long as the class is loaded.
     */


    int a = 10; // Instance variable, memory allocated during object creation.

    static int b = 10; // Class variable (static), memory shared among all objects.

    public static void main(String[] args) {
        // System.out.println(a);
        // Error: Cannot make a static reference to the non-static field 'a'

        Lab006 obj = new Lab006(); // Create an object to access the instance variable.
        System.out.println("Instance variable a: " + obj.a); // Accessing instance variable 'a'
        System.out.println("Class (static) variable b: " + b); // Accessing static variable 'b'

        obj.localVariables(); // Call the method to demonstrate local variables
    }

    public void localVariables() {
        int a = 20; // Local variable, limited to this method
        System.out.println("Local variable a: " + a);
    }
}

