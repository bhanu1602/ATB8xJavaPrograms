package Oct.ex_281024and301024.Collection.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Lab167 {

    // Operations on Hashtable

    /*
    Notes:
    - `Hashtable` does not allow null keys or values.
    - The `put` method inserts a key-value pair, replacing the value if the key already exists.
    - The `remove` method deletes an entry based on the specified key.
    - `Hashtable` is synchronized, making it thread-safe, but with slightly slower performance compared to `HashMap`.
    */

    public static void main(String[] args) {

        // Creating a Hashtable and adding entries
        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");

        // Updating value for key 3
        ht.put(3, "D");  // "C" is replaced with "D"

        // Creating another Hashtable
        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
        ht2.put(1, "A");
        ht2.put(2, "B");
        ht2.put(3, "C");

        // Removing entry with key 3
        ht2.remove(3);

        // Printing the mappings in each hashtable
        System.out.println("Mappings in ht: " + ht);
        System.out.println("Mappings in ht2: " + ht2);
    }
}

