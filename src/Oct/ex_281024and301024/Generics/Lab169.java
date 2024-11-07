package Oct.ex_281024and301024.Generics;

// We use < > to specify Parameter type
public class Lab169<T> {

    // Generics

    /*
    Parameter to methods, classes, and interfaces.
    Generics add type safety feature and create reusable code components in Java.

    Types:
    - Generic Method: A generic Java method takes a parameter and returns some value after performing a task. It is exactly like a normal function.
    - Generic Classes: A generic class is implemented exactly like a non-generic class. The only difference is that it contains a type parameter section.
      There can be more than one type of parameter, separated by a comma.
      Note: In Parameter type we cannot use primitives like ‘int’,’char’ or ‘double’.
    */

    // An object of type T is declared
    T obj;

    // Constructor
    Lab169(T obj) {
        this.obj = obj;
    }

    // Method to return the object
    public T getObject() {
        return this.obj;
    }

    // Main method
    public static void main(String[] args) {
        Lab169<Integer> iObj = new Lab169<>(1);
        System.out.println(iObj.getObject());
    }
}


