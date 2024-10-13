package Oct.ex_111024.Encapsulation.GoodExample;

public class Login {

    private String username;
    private String password;

    // Constructor for initializing username and password
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password, only accessible to admins
    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            if (password.length() >= 6) {  // Example validation: Password must be at least 6 characters long
                this.password = password;
                System.out.println("Password updated successfully.");
            } else {
                System.out.println("Password must be at least 6 characters long.");
            }
        } else {
            System.out.println("Access denied: You are not an admin.");
        }
    }
}

