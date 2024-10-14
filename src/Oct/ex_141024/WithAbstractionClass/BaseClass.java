package Oct.ex_141024.WithAbstractionClass;

// BaseClass inherits from GrandBaseClass
// It acts as a blueprint for all browsers by defining the structure and behaviors for browsers.
public class BaseClass extends GrandBaseClass {

    // Abstract-like methods to be implemented by subclasses.
    void openBrowser(String browser) {
        // Subclasses will implement this method
    }

    void closeBrowser() {
        // Subclasses will implement this method
    }
}

