package Oct.ex_161024.enums;
// Enum to store API endpoints as constants
public enum APIEndPoints {

    /*
    Enum to represent different API endpoints.
    - Each constant represents an API URL.
    - Enum values are initialized via a constructor.
    - getValue() method returns the URL for each endpoint.
    */

    BaseURl("https://app.vwo.com"),
    loginPage("https://app.vwo.com/login"),
    dashboardPage("https://app.vwo.com/dashboard");  // Fixed the case for 'dashboardPage'

    // Instance variable to store the URL
    private final String url;

    // Constructor to initialize the enum constants with their respective URLs
    APIEndPoints(String url) {
        this.url = url;
    }

    // Getter method to retrieve the URL
    public String getValue() {
        return url;
    }
}

// Class to test and call the enum constants
class Calling {

    public static void main(String[] args) {
        // Access and print the BaseURl using the enum constant and getValue() method
        System.out.println(APIEndPoints.BaseURl.getValue()); // Output: https://app.vwo.com

        // Similarly, you can access other API endpoints
        System.out.println(APIEndPoints.loginPage.getValue()); // Output: https://app.vwo.com/login
        System.out.println(APIEndPoints.dashboardPage.getValue()); // Output: https://app.vwo.com/dashboard
    }
}

