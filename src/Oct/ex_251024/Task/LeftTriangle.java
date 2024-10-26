package Oct.ex_251024.Task;

public class LeftTriangle {

    /*
    ✅ Left Triangle Star Pattern
    This program prints a left-aligned triangle star pattern with 5 rows.
    The pattern looks like this:

    *****
    ****
    ***
    **
    *
    */

    public static void main(String[] args) {
        // Outer loop for the number of rows (5 to 1)
        for (int i = 5; i > 0; i--) {
            // Inner loop for printing stars in each row
            for (int j = i; j > 0; j--) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

