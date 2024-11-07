package Oct.ex_281024and301024.Collection.LinkedList;

import java.util.LinkedList;

import java.util.LinkedList;

public class Lab150 {

    // Linked list to Array using toArray()

    /*
    Notes:
    - The `toArray()` method allows conversion of a LinkedList to an array.
    - This is beneficial when an array representation is required for compatibility
      with APIs that work with arrays or when random access is needed.
    - The `toArray()` method without parameters returns an `Object[]`.
      If a specific array type is desired, we can use the generic version `toArray(T[] a)`.
    - The resulting array is independent of the original list, so modifying one doesn’t affect the other.
     */

    public static void main(String[] args) {

        // Creating and initializing a LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("LinkedList: " + list);

        // Converting LinkedList to Object array
        Object[] array = list.toArray();
        System.out.println("Array from LinkedList (Object[]):");
        for (Object o : array) {
            System.out.println(o);
        }

        // Converting LinkedList to Integer array
        Integer[] intArray = list.toArray(new Integer[0]);
        System.out.println("Array from LinkedList (Integer[]):");
        for (Integer i : intArray) {
            System.out.println(i);
        }
    }
}

