package Oct.ex_161024.Static.Variables;

public class Counter {
    // Static variable to keep track of the number of instances
    static int count = 0;

    // Static method to increment the count
    static void increment() {
        count++;
    }

    // Static method to get the current count
    static int getCount() {
        return count;
    }

    // Constructor
    Counter() {
        increment(); // Increment count when a new instance is created
    }

    public static void main(String[] args) {
        // Creating the first instance of Counter
        Counter counter1 = new Counter();
        System.out.println("Counter after first instance: " + Counter.getCount()); // Use ClassName.getCount()

        // Creating the second instance of Counter
        Counter counter2 = new Counter();
        System.out.println("Counter after second instance: " + Counter.getCount()); // Use ClassName.getCount()

        // Creating the third instance of Counter
        Counter counter3 = new Counter();
        System.out.println("Counter after third instance: " + Counter.getCount()); // Use ClassName.getCount()
    }
}

