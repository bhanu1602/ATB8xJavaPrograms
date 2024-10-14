package Oct.ex_141024.WithAbstractionClass;

public class Lab103 {

    public static void main(String[] args) {

        // Dynamic dispatch (Polymorphism)
        // Creating an instance of ChromeTC using the BaseClass reference
        ChromeTC chromeTC = new ChromeTC();

        // Invoking the overridden methods in ChromeTC
        chromeTC.openBrowser("Chrome");    // Calls the Chrome-specific method
        chromeTC.takeScreenshot();         // Inherited from GrandBaseClass (common functionality)
        chromeTC.closeBrowser();           // Calls the Chrome-specific method

        // Creating an instance of FirefoxTC using the BaseClass reference
        FirefoxTC firefoxTC = new FirefoxTC();

        // Invoking the overridden methods in FirefoxTC
        firefoxTC.openBrowser("Firefox");  // Calls the Firefox-specific method
        firefoxTC.takeScreenshot();        // Inherited from GrandBaseClass (common functionality)
        firefoxTC.closeBrowser();          // Calls the Firefox-specific method
    }
}

