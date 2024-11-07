package Oct.ex_281024and301024.Collection.HashTable;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

public class Lab168 {

    // Demonstration of different iteration types for Hashtable

    /*
    Notes:
    - Hashtable iteration methods include for-each loop, entry set with Iterator, key set, values, and Enumeration.
    - Hashtable does not allow null keys or values and is synchronized.
    */

    public static void main(String[] args) {

        // Creating a Hashtable and adding entries
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Apple");
        ht.put(2, "Banana");
        ht.put(3, "Cherry");
        ht.put(4, "Date");

        System.out.println("Hashtable: " + ht);

        // Type 1: Using for-each loop with entrySet()
        System.out.println("\nIteration using for-each loop with entrySet:");
        for (Map.Entry<Integer, String> entry : ht.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Type 2: Using Iterator with entrySet()
        System.out.println("\nIteration using Iterator with entrySet:");
        Iterator<Map.Entry<Integer, String>> iterator = ht.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Type 3: Using keySet() to iterate over keys only
        System.out.println("\nIteration using keySet() to get keys only:");
        for (Integer key : ht.keySet()) {
            System.out.println("Key: " + key + ", Value: " + ht.get(key));
        }

        // Type 4: Using values() to iterate over values only
        System.out.println("\nIteration using values() to get values only:");
        for (String value : ht.values()) {
            System.out.println("Value: " + value);
        }

        // Type 5: Using Enumeration for keys
        System.out.println("\nIteration using Enumeration to get keys:");
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + ht.get(key));
        }

        // Type 6: Using Enumeration for values
        System.out.println("\nIteration using Enumeration to get values:");
        Enumeration<String> values = ht.elements();
        while (values.hasMoreElements()) {
            System.out.println("Value: " + values.nextElement());
        }
    }
}

