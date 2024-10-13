package Oct.ex_111024.Encapsulation.ExampleOne.Police;

public class Lab95 {
    // Police class

    private int gun; // Private field, should not be accessible directly
    private String ID; // Another critical field, should also be private and encapsulated

    // Constructor
    public Lab95(int gun) {
        this.gun = gun;
    }

    // Private method shoot(), which shouldn't be accessible from outside this class
    private void shoot() {
        System.out.println("You can shoot");
    }

    // If necessary, you can add controlled access via public getter methods
    // Example:
    public int getGun() {
        // Can have validation logic if required
        return gun;
    }

}
