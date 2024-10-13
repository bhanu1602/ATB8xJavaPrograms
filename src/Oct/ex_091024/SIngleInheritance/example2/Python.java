package Oct.ex_091024.SIngleInheritance.example2;

public class Python extends Programming {

    // Constructor for the Python class.
    // This constructor prints "DC" when an object of Python is created.
    public Python() {
        System.out.println("DC");
    }

    // This method prints the inherited 'author' and 'version' fields from the Programming class.
    void print() {
        System.out.println(author);  // Accesses 'author' from the Programming class.
        System.out.println(version); // Accesses 'version' from the Programming class.
    }

    public static void main(String[] args) {
        // Main method: Entry point of the program.
        Python python = new Python();
        python.print();
    }
}
