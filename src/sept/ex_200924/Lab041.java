package sept.ex_200924;

public class Lab041 {

    // Math functions
    /*
     * Math.max() - returns the maximum of two values
     * Math.min() - returns the minimum of two values
     * Math.sin() - returns the sine of the angle (in radians)
     * Math.cos() - returns the cosine of the angle (in radians)
     * Math.abs() - returns the absolute value of a number
     * Math.sqrt() - returns the square root of a value
     * Math.pow(a, b) - returns 'a' raised to the power of 'b'
     * Math.random() - returns a random double between 0.0 and 1.0
     */

    public static void main(String[] args) {
        int a = 10;
        int b = 23;

        // Maximum and Minimum
        System.out.println("Maximum: " + Math.max(a, b)); // returns the maximum of a and b
        System.out.println("Minimum: " + Math.min(a, b)); // returns the minimum of a and b

        // Sine and Cosine of 90 degrees
        System.out.println("Sine of 90 degrees: " + Math.sin(Math.toRadians(90))); // convert 90 degrees to radians
        System.out.println("Cosine of 90 degrees: " + Math.cos(90)); // cosine of 90 degrees

        // Absolute Value
        System.out.println("Absolute value of -1: " + Math.abs(-1)); // returns the absolute value

        // Square Root
        System.out.println("Square root of 16: " + Math.sqrt(16)); // returns the square root of 16

        // Power
        System.out.println("2 raised to the power of 3: " + Math.pow(2, 3)); // 2^3 = 8

        // Random number between 0 and 1
        System.out.println("Random number: " + Math.random()); // generates a random double between 0.0 and 1.0
    }
}

