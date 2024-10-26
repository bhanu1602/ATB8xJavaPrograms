package Oct.ex_251024.Arrays;

public class Lab139 {

    // Example for Array of Objects
    public int rollNo;
    public String name;

    // Constructor to initialize roll number and name
    Lab139(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class Access {
    public static void main(String[] args) {

        // Declaring an array of Lab139 objects
        Lab139[] arr;
        arr = new Lab139[5]; // Memory allocation for 5 objects

        // Initializing each element with a new Lab139 object
        arr[0] = new Lab139(1, "Alex");
        arr[1] = new Lab139(2, "Bob");
        arr[2] = new Lab139(3, "Charlie");
        arr[3] = new Lab139(4, "David");
        arr[4] = new Lab139(5, "Eli");

        // Accessing elements in the array and printing the details
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].rollNo + ": " + arr[i].name);
        }
    }
}

