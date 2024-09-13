package sept.ex_060924;

public class Lab003 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        main("Bhanu");
        // Calls the overloaded main method with a single String argument
    }

    public static void main(String args) {
        // Overloaded version of the main method that takes a single String argument
        System.out.println("Hello World");
        System.out.println(args); // Print the argument passed, which is "Bhanu"

    }

    public void main(int args) {
        // Another overloaded version of the main method that takes an int argument
        System.out.println("Hello World");
    }
}


