package Oct.ex_161024.Static.Blocks;

public class Lab111 {

    // Instance Initialization Block (IIB)
    /*
     This block is executed every time an instance of the class is created.
     It runs before the constructor and can be used to initialize instance variables
     or perform actions that need to be executed with each object creation.
    */
    {
        System.out.println("This is the instance initialization block executed when an object is created");
    }

    // Static Initialization Block (SIB)
    /*
     This block is executed only once when the class is loaded into memory,
     regardless of how many instances are created. It can be used to initialize
     static variables or perform any setup required before the class is used.
    */
    static {
        System.out.println("This is the static initialization block executed when the class is loaded");
    }

    public static void main(String[] args) {
        // Creating the first instance of Lab111
        Lab111 staticCalling = new Lab111();
        // Creating the second instance of Lab111
        Lab111 staticCalling2 = new Lab111();
        // Creating a third instance of Lab111
        new Lab111();

        // Declaration of a reference variable of type Lab111
        Lab111 a2; // No instance is created here, so no output related to initialization blocks
    }
}

