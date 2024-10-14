package Oct.ex_141024.WithAbstractionClass;

// ChromeTC inherits from BaseClass and provides concrete implementations
// Represents a test case for Chrome browser, with its specific behavior.
public class ChromeTC extends BaseClass {

    // Overriding openBrowser() method to provide Chrome-specific behavior
    @Override
    void openBrowser(String browser) {
        System.out.println("Chrome browser opened: " + browser);
    }

    // Overriding closeBrowser() method to provide Chrome-specific behavior
    @Override
    void closeBrowser() {
        System.out.println("Chrome browser closed");
    }
}

