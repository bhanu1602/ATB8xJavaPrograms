package Oct.ex_251024.Arrays;

import java.util.Arrays;

public class Lab136 {

    // Java program to illustrate creating an array of integers, putting some values in the array,
    // and printing each value to standard output.

    public static void main(String[] args) {

        int[] arr; // Declaration of an integer array

        arr = new int[10]; // Memory allocation for 10 integers

        // Initializing array elements
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        // Accessing elements with a standard `for` loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Using `Arrays` utility methods
        System.out.println("\nSorted Array:");
        Arrays.sort(arr); // Sorts the array in ascending order
        for (int i : arr) { // Enhanced for-loop to display sorted array
            System.out.println(i);
        }

        // Searching for an element using `binarySearch`
        int item = Arrays.binarySearch(arr, 9); // Returns the index of the search key if found, else returns a negative number
        System.out.println("\nIndex of element '9': " + item);
    }
}

/*
    Additional Notes:

    1. `Arrays.sort(array)`:
       - Sorts the array in ascending order. Uses a modified version of quicksort for primitive types.
       - Sorting is efficient and takes O(n log n) time complexity on average.

    2. `Arrays.binarySearch(array, key)`:
       - Searches for the specified `key` in the sorted array.
       - Returns the index if the key is found; otherwise, returns a negative value indicating insertion point.
       - The array must be sorted before calling `binarySearch`; otherwise, results will be unpredictable.

    3. Array Traversal:
       - You can traverse arrays using either a standard `for` loop or an enhanced `for-each` loop.
       - The `for-each` loop simplifies syntax and avoids index-related errors but does not provide index access.

    4. `arr.length`:
       - `length` is a property, not a method. It gives the number of elements in the array.
       - Arrays have a fixed size, defined at the time of memory allocation.

    5. Using `Arrays` Class Methods:
       - The `Arrays` class provides static methods to manipulate arrays (e.g., `fill`, `copyOf`, `equals`, `hashCode`).
       - `Arrays.fill(array, value)` initializes all elements with the specified `value`.
       - `Arrays.copyOf(array, newLength)` creates a copy of the array with a specified length.
*/

