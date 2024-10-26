package Oct.ex_251024.Arrays;

public class Lab135 {

    // Valid array declarations
    int Array[];        // Declares an array using brackets after the variable name
    int[] intArray;     // Preferred style in Java: brackets immediately follow the type

    // Arrays for different primitive data types
    byte[] byteArray;    // Array of bytes
    short[] shortArray;  // Array of shorts
    char[] charArray;    // Array of characters
    boolean[] booleanArray; // Array of booleans (default values will be `false`)
    long[] longArray;    // Array of longs
    float[] floatArray;  // Array of floats
    double[] doubleArray; // Array of doubles

    // Declaring an array without assigning memory
    int[] inArray; // No memory allocated yet

    public Lab135() {
        // Allocating memory to array
        inArray = new int[20]; // Fixed-size array; cannot change size after declaration

        // Combining declaration and memory allocation in one statement
        int[] anotherArray = new int[10]; // Size defined; array holds 10 int values, all initialized to 0 by default

        // Declaring and initializing an array with values (array literal)
        /*
         * Array literal syntax is used when the values are known at compile-time.
         * If the values are specified directly, there is no need for `new int[]`.
         * Array literals cannot be used to resize or reassign the array once initialized.
         */
        int[] integerArray = {1, 558, 698, 9852, 65}; // Fixed size based on given values

        // Accessing array elements using a loop
        System.out.println("Values in integerArray:");
        for (int num : integerArray) { // `for-each` loop to iterate over array elements
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        new Lab135();
    }
}

/*
    Additional Notes:
    1. Array Initialization:
       - Arrays must be initialized before use; otherwise, a `NullPointerException` will be thrown when accessed.
       - Default values: 0 for numeric types, `false` for booleans, and `null` for object references.

    2. Array Size:
       - Once defined, the array size is fixed in Java. If a dynamic array is needed, consider using `ArrayList`.
       - Attempting to access an index out of bounds will result in an `ArrayIndexOutOfBoundsException`.

    3. Multi-dimensional Arrays:
       - Java supports multi-dimensional arrays (e.g., `int[][] matrix = new int[3][3];`), which are arrays of arrays.
       - These can be jagged (irregular lengths in sub-arrays) as each sub-array can have a different length.

    4. Array Limitations:
       - Array elements are stored in contiguous memory, which makes accessing elements fast but limits flexibility.
       - Arrays in Java are objects, which means they have methods like `.length`, but they do not support resizing.
*/

