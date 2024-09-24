package sept.ex_200924;

public class Lab040 {
    // Finding the max and min between two numbers using the ternary operator

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Ternary operator to find the minimum between a and b
        int min = a < b ? a : b;  // If a is less than b, min is a; otherwise, it's b.

        // Ternary operator to find the maximum between a and b
        int max = a > b ? a : b;  // If a is greater than b, max is a; otherwise, it's b.

        // Output the results
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

