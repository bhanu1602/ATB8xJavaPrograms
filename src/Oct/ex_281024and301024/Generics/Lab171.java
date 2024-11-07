package Oct.ex_281024and301024.Generics;


// Generic functions example
/*
Notes:
This example demonstrates how a single generic method can handle different types of arguments
based on the type passed to it. The compiler generates the appropriate method implementation
based on the type of argument used during the method call.
*/

public class Lab171 {

    // Generic method to display the type of the element
    static <T> void genericDisplay(T element) {
        System.out.println("Type: " + element.getClass().getName() + " | Value: " + element);
    }

    public static void main(String[] args) {

        // Calling the generic method with different types of arguments
        genericDisplay(11);          // Integer
        genericDisplay("Geeks");     // String
        genericDisplay(1.0);         // Double
    }
}

