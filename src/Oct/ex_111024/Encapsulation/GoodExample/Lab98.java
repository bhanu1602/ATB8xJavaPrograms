package Oct.ex_111024.Encapsulation.GoodExample;

public class Lab98 {

    public static void main(String[] args) {

        // Creating a new Login object with initial username and password
        Login login = new Login("admin", "admin123");

        // Displaying the current password
        System.out.println("Current password: " + login.getPassword());

        // Simulating an admin user updating the password
        boolean isAdmin = true;
        login.setPassword("newPassword123", isAdmin);  // Password updated

        // Attempting to update the password as a non-admin
        isAdmin = false;
        login.setPassword("anotherPassword", isAdmin);  // Access denied

        // Checking the updated password (wouldn't be done like this in a real system)
        System.out.println("Updated password: " + login.getPassword());
    }
}

