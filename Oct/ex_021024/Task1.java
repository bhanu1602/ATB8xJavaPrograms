package Oct.ex_021024;

public class Task1 {

    /*
    Class is a blueprint:
    - A class defines a template for objects by encapsulating data (fields) and methods (behavior).

    Class Features:
    - Collection of methods, constructors, nested classes, and variables.
    - Used to encapsulate data and behavior.
    - Public classes can be reused across different files or packages.
    - Class is a user-defined data type.
    - When a class is created, memory is **not** allocated. Memory is allocated only when an object (instance) of the class is created.

    Objects:
    - Objects are instances of classes. They inherit the attributes (variables) and behaviors (methods) defined by their class.
    - Every object has its own state (values of variables) and behavior (methods it can execute).
    - Objects are allocated memory on the heap.

    Object Components:
    1. **State**: The current values of an object's instance variables.
    2. **Behavior**: Methods that define what the object can do.
    3. **Identity**: The unique address (memory reference) of the object.

    Object Creation:
    - Objects are created using the `new` keyword.
    - Can create multiple objects for the same class (n number of objects).
    - **Anonymous objects**: Created without storing their reference, typically used in cases where the object is used only once (e.g., `new Object().someMethod()`).

    Memory Allocation:
    - Memory is allocated once an object is created using the `new` keyword, not when the class itself is defined.
    - Primitive data types (int, char, etc.) are stored in the stack, while non-primitive types (objects) are stored in the heap.

    Garbage Collection:
    - When an object no longer has any references pointing to it, it becomes eligible for garbage collection.
    - The Java garbage collector automatically deallocates memory used by unreferenced objects.

    Class Declaration Rules:
    - A class can only be declared once in a file.
    - Components of a class include:
      - Access modifiers (e.g., `public`, `private`, `protected`).
      - `class` keyword followed by the class name.
      - Optionally extends a superclass or implements interfaces.
      - Body is enclosed within `{}`.
    */

    public static void main(String[] args) {
        // Object creation example (for demonstration purpose)
        // Task1 obj = new Task1(); // This creates an instance of Task1, allocating memory on the heap
    }
}

