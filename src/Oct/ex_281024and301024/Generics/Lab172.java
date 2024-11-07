package Oct.ex_281024and301024.Generics;

// Generic Types Differ Based on Their Type Arguments
/*
We cannot use primitive data types like int, char, etc.
Instead, we must use their corresponding wrapper classes,
such as Integer, Character, etc.
*/

public class Lab172<T> {
    // Declaring a generic type variable T
    T obj;

    // Constructor to initialize the generic object
    Lab172(T obj) {
        this.obj = obj;
    }

    // Getter method to retrieve the object
    public T getObj() {
        return this.obj;
    }
}

class Lab173 {
    public static void main(String[] args) {

        // Using String as the type argument
        Lab172<String> obj = new Lab172<String>("Hello");
        System.out.println(obj.getObj());  // Output: Hello

        // Using Integer as the type argument (note: Integer is the wrapper class for int)
        Lab172<Integer> iObj = new Lab172<Integer>(10);
        System.out.println(iObj.getObj());  // Output: 10
    }
}
