package Oct.ex_281024and301024.Generics;

// Demonstrating Type Parameters in Java Generics

public class Lab174<K, V, E> {

    // Type Parameters for Key, Value, and Element
    // K is used for Key (commonly used in maps)
    // V is used for Value (commonly used in maps)
    // E is used for Element (commonly used in collections like lists or sets)

    private K key;   // Declare variable for Key type
    private V value; // Declare variable for Value type
    private E element; // Declare variable for Element type

    // Constructor for initializing key, value, and element
    public Lab174(K key, V value, E element) {
        this.key = key;       // Assign Key parameter to instance variable
        this.value = value;   // Assign Value parameter to instance variable
        this.element = element; // Assign Element parameter to instance variable
    }

    // Methods to retrieve key, value, and element
    public K getKey() {
        return key;  // Return the stored key
    }

    public V getValue() {
        return value; // Return the stored value
    }

    public E getElement() {
        return element; // Return the stored element
    }

    // Method to display all information
    public void display() {
        // Output all the values stored in key, value, and element
        System.out.println("Key: " + getKey() + ", Value: " + getValue() + ", Element: " + getElement());
    }

    // Main method to test the generic class with specific types
    public static void main(String[] args) {
        // Creating an instance with Integer (K), String (V), and Double (E) as type arguments
        // K = Integer, V = String, E = Double
        Lab174<Integer, String, Double> obj = new Lab174<>(1, "Item", 5.5);

        // Display the stored values
        obj.display();  // Output: Key: 1, Value: Item, Element: 5.5
    }
}

