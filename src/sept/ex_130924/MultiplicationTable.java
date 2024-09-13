package sept.ex_130924;

import java.util.Scanner; // Importing the Scanner class to read user input

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Initializing the Scanner object 'sc' to take input from the user.
        System.out.println("Enter the number to generate its multiplication table: ");

        int a = sc.nextInt(); // Storing the user input number in variable 'a'

        // Loop to print the multiplication table of 'a' from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Formatting the output using printf. %d is used
            System.out.printf("%d x %d = %d\n", a, i, a * i);
            // Notes:
            // - %d is a placeholder for integers.
            // - \n is used for a new line after each result.
        }

        sc.close(); // Closing the Scanner to avoid resource leaks.
    }
}

