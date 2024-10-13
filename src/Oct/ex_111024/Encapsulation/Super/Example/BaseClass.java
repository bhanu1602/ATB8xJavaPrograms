package Oct.ex_111024.Encapsulation.Super.Example;

public class BaseClass {

    private String browser;  // Field to store the browser name

    // Default constructor
    BaseClass() {
        System.out.println("DC - BaseClass");  // Output when the default constructor is called
    }

    // Parameterized constructor
    BaseClass(String b) {
        System.out.println("CC - BaseClass");  // Output when the parameterized constructor is called
    }

    // Getter for the browser variable
    public String getBrowser() {
        return browser;
    }

    // Setter for the browser variable with authentication check
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;  // Sets the browser if authenticated
        } else {
            System.out.println("Not allowed to set browser");  // Error message if not authenticated
        }
    }

    // Method to open the browser
    void openBrowser() {
        System.out.println("Opening browser");
    }

    // Overloaded method to open the browser with a specific name
    void openBrowser(String browserName) {
        System.out.println("Opening browser: " + browserName);
    }

    // Method to close the browser
    void closeBrowser() {
        System.out.println("Closing browser");
    }
}

