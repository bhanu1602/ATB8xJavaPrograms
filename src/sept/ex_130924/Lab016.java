package sept.ex_130924;

public class Lab016 {

    // Literals in Java

    /*
     * Boolean Literals:
     * - Represents either true or false.
     * - Boolean variables can only hold one of these two values.
     * - Example: boolean isFemale = true;
     *
     * Character Literals:
     * - A single character enclosed in single quotes ('').
     * - Each character has a corresponding integral value called the ASCII value (0-255).
     * - For example, 'A' has an ASCII value of 65, and 'a' has an ASCII value of 97.
     * - Escape sequences are special character literals used for formatting text output:
     *   - '\n' : New line
     *   - '\t' : Tab space
     *   - '\b' : Backspace
     *   - '\r' : Carriage return (moves the cursor to the beginning of the line)
     *   - '\f' : Form feed (used in printers for page breaks)
     */

    public static void main(String[] args) {

        // Boolean literal example
        boolean isFemale = true;  // Literal true assigned to boolean variable

        // Character literal examples with escape sequences
        char newlineChar = '\n';  // Newline
        char carriageReturnChar = '\r';  // Carriage return
        char tabChar = '\t';  // Tab space
        char formFeedChar = '\f';  // Form feed
        char backspaceChar = '\b';  // Backspace

        // Output showing the effect of escape sequences
        System.out.println(isFemale);  // Prints: true
        System.out.println("This is a newline:" + newlineChar + "Text after newline");
        System.out.println("This is a carriage return:" + carriageReturnChar + "Text after carriage return");
        System.out.println("This is a tab:" + tabChar + "Text after tab");
        System.out.println("This is a form feed:" + formFeedChar + "Text after form feed");
        System.out.println("This is a backspace:" + backspaceChar + "Text after backspace");

    }
}

