package Oct.ex_281024and301024.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab144 {
    // ArrayList Example

    /*
    Notes:
    - ArrayList is part of the Collection framework, implemented using dynamic arrays.
    - It allows dynamic resizing (unlike standard arrays which have a fixed size).
    - Slower than standard arrays for accessing elements due to additional overhead.
    - Elements can be added or removed easily, making it flexible for various use cases.
    */

    public static void main(String[] args) {

        // Initializing ArrayList with initial capacity of 5
        List<Integer> arrlist = new ArrayList<>(5);

        // Adding elements to ArrayList
        arrlist.add(10025);
        arrlist.add(10026);
        arrlist.add(12028);

        // Printing ArrayList elements
        System.out.println("Original ArrayList: " + arrlist);

        // Sorting elements in ascending order
        Collections.sort(arrlist);
        System.out.println("Sorted ArrayList: " + arrlist);

        // Reversing the sorted ArrayList
        Collections.reverse(arrlist);
        System.out.println("Reversed ArrayList using Collections.reverse(): " + arrlist);

        // Sorting in descending order using reverseOrder comparator
        arrlist.sort(Collections.reverseOrder());
        System.out.println("Sorted in Descending Order using reverseOrder: " + arrlist);
    }
}

