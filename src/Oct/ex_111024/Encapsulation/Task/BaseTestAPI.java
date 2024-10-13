package Oct.ex_111024.Encapsulation.Task;

public class BaseTestAPI {
    private String name; // Name of the API user
    private int id;      // ID associated with the API user

    // Default constructor
    BaseTestAPI() {
        System.out.println("BaseTestAPI: Default Constructor");
    }

    // Parameterized constructor
    BaseTestAPI(String name, int id) {
        this.name = name; // Assign name to the instance variable
        this.id = id;     // Assign id to the instance variable
        System.out.println("BaseTestAPI: Parameterized Constructor");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id with validation
    public void setId(int id) {
        if (id > 0) { // Ensure id is positive
            this.id = id;
        } else {
            System.out.println("BaseTestAPI: Please enter a valid ID");
        }
    }

    // Method for performing GET operation
    public void performGET() {
        System.out.println("BaseTestAPI: Performing GET operation");
    }

    // Method for performing POST operation
    public void performPOST() {
        System.out.println("BaseTestAPI: Performing POST operation");
    }

    // Method for performing PUT operation
    public void performPUT() {
        System.out.println("BaseTestAPI: Performing PUT operation");
    }

    // Method for performing DELETE operation
    public void performDELETE() {
        System.out.println("BaseTestAPI: Performing DELETE operation");
    }

    // Method for performing PATCH operation
    public void performPATCH() {
        System.out.println("BaseTestAPI: Performing PATCH operation");
    }
}

