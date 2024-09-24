package sept.ex_200924;

public class Lab045 {
    // To find if a number is even or odd

    /*
     * This program checks if a given number is even or odd
     * by using the modulus operator (%) to determine if there is a remainder
     * when the number is divided by 2.
     */

    public static void main(String[] args) {
        int num = 13; // Number to be checked

        // Check if the number is even
        if (num % 2 == 0) {
            System.out.println("The " + num + " is even"); // Output if even
        } else {
            System.out.println("The " + num + " is odd"); // Output if odd
        }
    }
}

