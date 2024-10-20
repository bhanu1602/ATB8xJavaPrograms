package Oct.ex_161024.Static.Blocks;

public class Lab112 {

    public static void main(String[] args) {
        // Creating an instance of ATB, which triggers the execution of the instance initialization block (IIB)
        ATB a = new ATB(); // Executes instance block
    }

}

// Class definition for ATB
class ATB {

    // Instance Initialization Block (IIB)
    /*
     This block is executed each time an instance of the ATB class is created.
     It runs before the constructor and can be used to initialize instance variables
     or perform actions required for each object.
    */
    {
        System.out.println("When does it execute?"); // Message indicating when the block runs
        System.out.println("Read from CSV file");    // Simulating reading from a CSV file
    }

    // Static Initialization Block (SIB)
    /*
     This block is executed only once when the class is loaded into memory.
     It is ideal for initializing static variables or performing actions that
     should occur once for the class rather than for each instance.
    */
    static {
        System.out.println("Static block"); // Message indicating the static block execution
        System.out.println("When the class loads, I will execute"); // Describing when this block runs
    }
}

