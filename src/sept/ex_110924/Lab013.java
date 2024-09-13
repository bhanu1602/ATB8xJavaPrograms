package sept.ex_110924;

// Example for Annotation Type
public class Lab013 {

    // Annotation Type Example
    /*
     * Annotation Type: Provides metadata about the code.
     * `@Deprecated` marks a method or class as outdated and warns that it should not be used.
     * `LegacyCode` class contains a deprecated method `oldMethod`.
     */
    @Deprecated
    public static class LegacyCode {
        public void oldMethod() {
            System.out.println("This is an old method.");
        }
    }

    public static void main(String[] args) {
        LegacyCode legacy = new LegacyCode();
        legacy.oldMethod(); // Output: This is an old method.
        // Note: This will show a warning that the method is deprecated.
    }
}
