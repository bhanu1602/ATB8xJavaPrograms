package sept.ex_130924;

import java.util.Scanner; //Importing scanner class

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner class used to get input from the user.
        // 'sc' is the Scanner object that takes input from the console (System.in).

        System.out.println("Enter two numbers:");
        int firstValue = sc.nextInt(); // Taking first integer input from the user.
        int secondValue = sc.nextInt(); // Taking second integer input from the user.

        // Performing arithmetic operations on the two input values and displaying the results.
        System.out.println("The addition of " + firstValue + " and " + secondValue + " is " + (firstValue + secondValue)); // Performs addition.
        System.out.println("The subtraction of " + firstValue + " and " + secondValue + " is " + (firstValue - secondValue)); // Performs subtraction.
        System.out.println("The multiplication of " + firstValue + " and " + secondValue + " is " + (firstValue * secondValue)); // Performs multiplication.
        System.out.println("The division of " + firstValue + " and " + secondValue + " is " + (firstValue / secondValue)); // Performs division.
        System.out.println("The modulus of " + firstValue + " and " + secondValue + " is " + (firstValue % secondValue)); // Performs modulus.

        sc.close(); // Closing the Scanner object to prevent resource leaks.
    }
}
