package Oct.ex_281024and301024.Generics;

public class Lab170<T, U> {

    // Multiple type parameters in a generic class
    T obj1;
    U obj2;

    // Constructor with parameters of type T and U
    Lab170(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // Method to print the values of obj1 and obj2
    public void print() {
        System.out.println("Object 1: " + obj1);
        System.out.println("Object 2: " + obj2);
    }
}

// Main class to test Lab170
class Main {
    public static void main(String[] args) {
        // Creating an instance of Lab170 with String and Integer types
        Lab170<String, Integer> obj = new Lab170<>("CAG", 10);
        obj.print(); // Output: CAG and 10
    }
}

