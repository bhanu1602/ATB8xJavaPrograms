package Oct.ex_161024.Static.Classes;

public class Lab114 {

    // Static keyword with classes

    /*
    1. A nested class can be declared as static.
    2. Static nested classes cannot access instance variables or methods of the outer class.
    3. Top-level classes cannot be declared static.
    4. Static nested classes can access static variables and methods of the outer class directly.
    */

    private static String str = "Bha"; // Static variable of the outer class

    // Static nested class
    static class NestedClass {

        // Method to display a message and the static variable from the outer class
        public void display() {
            System.out.println("This is a non-static method in a static nested class.");
            System.out.println("Accessing static variable from outer class: " + str);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        NestedClass nc = new NestedClass();
        nc.display(); // Calling the display method
    }
}

