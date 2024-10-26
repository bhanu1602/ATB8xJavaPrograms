package Oct.ex_251024.Task;

public class Pyramid {

    /*
✅ Pyramid pattern in Java

    *
   ***
  *****
 *******
*********
     */
    public static void main(String[] args) {

        // Outer loop for the number of rows (1 to 8)
        for (int i = 0; i < 8; i++) {
            // Inner loop for printing spaces in each row
            for (int j = i; j < 8; j++) {
                System.out.print(" ");
            }
            // Loop for printing stars in each row
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
