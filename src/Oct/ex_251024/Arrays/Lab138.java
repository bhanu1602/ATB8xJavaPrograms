package Oct.ex_251024.Arrays;

public class Lab138 {

    // Array of objects

    /*
    Notes:
    1. Arrays in Java can store objects as well as primitive types.
    2. Each element in an object array holds a reference to an object, not the object itself.
    3. Useful for managing multiple instances of a class in a structured way.
    4. If the array is initialized with objects, they must be instantiated separately to avoid `NullPointerException`.
     */

    public static void main(String[] args) {

        // Array of integers
        int[] arr = new int[10];
        System.out.println("Integer array size: " + arr.length);

    }
}

