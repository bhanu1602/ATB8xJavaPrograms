package Oct.ex_251024.Arrays;

public class Lab134 {

    // Arrays

    /*
    Notes:
    - Arrays are collections of similar data types (homogeneous).
    - Stored in contiguous memory allocations.
    - Arrays are objects in Java.
    - Size is mandatory upon array creation.
    - Cannot assign negative value to array size, or a NegativeArraySizeException is thrown.
    - Accessing an index outside of the array bounds throws ArrayIndexOutOfBoundsException.
    - Arrays can hold primitive data types or reference types.
    - Default values:
        - Numeric (int, float, etc.) - 0
        - Boolean - false
        - Object references - null
    - Array elements can be accessed by their index (starting at 0).
    - Arrays are declared, constructed, and then initialized.
    */

    public static void main(String[] args) {

        // Example of array declaration and initialization
        int[] marks = {51, 61, 59, 98, 58};

        System.out.println("Array length: " + marks.length);

        // Accessing elements using index
        System.out.println("marks[0]: " + marks[0]);
        System.out.println("marks[1]: " + marks[1]);
        System.out.println("marks[2]: " + marks[2]);
        System.out.println("marks[3]: " + marks[3]);
        System.out.println("marks[4]: " + marks[4]);

        // Uncommenting the following line will throw ArrayIndexOutOfBoundsException
        // System.out.println(marks[5]);

        // Declaration and construction with default values
        int[] marks2 = new int[5]; // All elements initialized to 0

        // Initializing specific elements
        marks2[0] = 90;
        marks2[1] = 80;
        marks2[2] = 70;

        System.out.println("marks2[3]: " + (marks2[3] = 50)); // Updating element
        System.out.println("marks2[4]: " + (marks2[4] = 50));

        // Uncommenting the following line will throw ArrayIndexOutOfBoundsException
        // System.out.println(marks2[5]);

        // Working with default values
        int[] defaultArray = new int[3];
        System.out.println("Default value at index 0: " + defaultArray[0]); // Outputs 0

        boolean[] boolArray = new boolean[2];
        System.out.println("Default boolean value at index 0: " + boolArray[0]); // Outputs false

        String[] strArray = new String[2];
        System.out.println("Default String value at index 0: " + strArray[0]); // Outputs null

        // Demonstrating NegativeArraySizeException
        try {
            int[] negativeArray = new int[-5]; // Negative size, throws NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException: " + e);
        }
    }
}

