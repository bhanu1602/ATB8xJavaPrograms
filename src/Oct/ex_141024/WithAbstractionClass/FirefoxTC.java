package Oct.ex_141024.WithAbstractionClass;

// FirefoxTC inherits from BaseClass and provides concrete implementations
// Represents a test case for Firefox browser, with its specific behavior.
public class FirefoxTC extends BaseClass {

    // Overriding openBrowser() method to provide Firefox-specific behavior
    @Override
    void openBrowser(String browser) {
        System.out.println("Firefox browser opened: " + browser);
    }

    // Overriding closeBrowser() method to provide Firefox-specific behavior
    @Override
    void closeBrowser() {
        System.out.println("Firefox browser closed");
    }
}

