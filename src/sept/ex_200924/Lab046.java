package sept.ex_200924;

public class Lab046 {
    // Program to find the maximum of two numbers

    /*
     * This program compares two numbers (num1 and num2) and prints
     * the larger number. If both numbers are equal, it prints "Equal".
     */

    public static void main(String[] args) {
        int num1 = 23; // First number
        int num2 = 42; // Second number

        // Check which number is greater or if they are equal
        if (num1 > num2) {
            System.out.println(num1); // Print num1 if it's greater
        } else if (num2 > num1) {
            System.out.println(num2); // Print num2 if it's greater
        } else {
            System.out.println("Equal"); // Print if both are equal
        }
    }
}
