package sept.ex_230924;

public class Lab050 {

    // In automation testing, switch statements are often used to open a specific browser
    // based on the input string. This allows automation frameworks to be flexible in
    // running tests across different browsers (like Chrome, Firefox, Opera, etc.).

    /*
     * Notes:
     * 1. The `switch` statement is an alternative to multiple `if-else` statements.
     * 2. In browser automation (e.g., using Selenium WebDriver), the browser type is often
     *    passed as a string, and the `switch` block can be used to initialize the desired
     *    WebDriver instance based on that input.
     * 3. Without the `break` statements, the switch statement will fall through and execute
     *    all subsequent cases, unless a `break` is encountered.
     * 4. A `default` case can be added to handle unexpected inputs, ensuring robust code.
     */

    public static void main(String[] args) {

        String browser = "chrome"; // Change this to test different browser cases

        switch (browser) {
            case "chrome":
                System.out.println("Opening Chrome browser");
                break;  // `break` ensures only the "chrome" case runs
            case "firefox":
                System.out.println("Opening Firefox browser");
                break;
            case "opera":
                System.out.println("Opening Opera browser");
                break;
            default:
                // Default case handles invalid or unsupported browser types
                System.out.println("Invalid browser type, please select a valid browser.");
        }
    }
}

