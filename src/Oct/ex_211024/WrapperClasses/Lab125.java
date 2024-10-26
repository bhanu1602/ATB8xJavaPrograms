package Oct.ex_211024.WrapperClasses;

public class Lab125 {

    // Custom Wrapper Classes

    /*
    Notes:
    - A custom wrapper class encapsulates data inside it and provides controlled access through methods.
    - In this example, we create a simple wrapper that stores integers and tracks the maximum value inserted, as well as the number of elements inserted.
    - This is a basic implementation of a custom wrapper class to handle specific operations on the data.
    */

    private int max = Integer.MIN_VALUE; // Initialized to the smallest value to handle any initial comparison
    private int size = 0;

    // Method to insert values into the class
    public void insert(int value) {
        this.size++; // Increment size for each element inserted
        if (value > this.max) {
            this.max = value; // Update max only if the new value is greater than current max
        }
    }

    // Method to get the maximum value inserted
    public int top() {
        return this.max;
    }

    // Method to get the total number of elements inserted
    public int elementNumber() {
        return this.size;
    }
}

class TestLab125 {

    public static void main(String[] args) {

        Lab125 obj = new Lab125(); // Create an instance of the custom wrapper class
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);

        // Display results
        System.out.println("Max element: " + obj.top()); // Output max element
        System.out.println("Number of elements inserted: " + obj.elementNumber()); // Output number of elements
    }
}

