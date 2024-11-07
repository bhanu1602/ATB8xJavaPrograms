package Oct.ex_281024and301024.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab156 {

    // Set Iteration

    /*
    Notes
    - **Set Interface**: A collection that prohibits duplicate elements.
    - **HashSet**: Implements the Set interface and is backed by a hash table. It does not maintain the order of elements.
    - **Iteration Methods**:
        1. **For-Each Loop**: A simplified way to iterate through a collection. It is easier to read and less error-prone.
        2. **Iterator**: An explicit iterator that provides methods to traverse the collection. It is useful when you need to remove elements during iteration.
    */

    public static void main(String[] args) {

        // Creating a HashSet of Strings
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");

        // Iterating using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String s : set) {
            System.out.println(s);
        }

        // Iterating using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

