package Oct.ex_021024;

public class ATBStudent extends Object {
    // Object class in Java

    /*
    Notes:

    - **Object Class**:
      - In Java, `Object` is the root class from which every class directly or indirectly inherits.
      - All classes automatically extend the `Object` class, which provides some default methods like `toString()`, `equals()`, and `hashCode()`.
      - When we don't specify any parent class, Java automatically extends `Object`.
      - In this case, `ATBStudent` extends `Object`, but it's implicit because every class does, even if we don’t declare it.

    - **C - Class (ATBStudent)**:
      - This class `ATBStudent` represents a blueprint for students.
      - It contains attributes (fields) like `phone`, `name`, `age`, etc., and methods (behavior) like `study()`, `sleep()`, and `walk()`.

    - **A - Attributes**:
      - **Attributes** (also known as data members, instance variables, fields, or member variables) are variables that store the state of the object.
      - In this class, the attributes include:
        - `phone` (long) - to store the student's phone number.
        - `name` (String) - to store the student's name.
        - `age` (int) - to store the student's age.
        - `gender` (boolean) - to represent the student's gender (e.g., true for male, false for female).
        - `sid` (String) - to store the student's student ID.

    - **B - Behavior**:
      - **Methods** (also known as member functions) represent the behavior or actions of the class.
      - In this class, the behaviors include:
        - `study()` - representing the action of studying.
        - `sleep()` - representing the action of sleeping.
        - `walk()` - representing the action of walking.
      - These methods currently have no return values (void) and no parameters. They can be filled in later with actual logic.

    - **Important Methods from Object Class**:
      - Since this class extends `Object`, it inherits the following methods:
        1. `toString()` - Converts the object into a string representation.
        2. `equals(Object o)` - Compares the object with another object for equality.
        3. `hashCode()` - Returns a hash code value for the object, useful in hashing collections.
        4. `getClass()` - Returns the runtime class of the object.

    */

    // Attributes (Data Members)
    long phone;
    String name;
    int age;
    boolean gender;
    String sid;

    // Methods (Behavior)

    // Method to represent the student studying
    void study() {
        // No return type, no arguments
    }

    // Method to represent the student sleeping
    void sleep() {
        // No return type, no arguments
    }

    // Method to represent the student walking
    void walk() {
        // No return type, no arguments
    }
}

