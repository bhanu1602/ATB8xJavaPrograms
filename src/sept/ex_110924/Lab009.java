package sept.ex_110924;

public class Lab009 {

    // Floating point data types
    /*
     * Floating-point data types are used to represent numbers with fractional parts.
     * There are two types in Java:
     *
     * a) float:
     * - Size: 32 bits (4 bytes)
     * - Precision: Approximately 7 decimal digits
     * - Example: float a = 1.2345f; // 'f' suffix is required to denote a float literal
     * - Use float when you need to save memory and precision is less critical.
     *
     * b) double:
     * - Size: 64 bits (8 bytes)
     * - Precision: Approximately 15 decimal digits
     * - Example: double b = 1.2345d; // 'd' suffix is optional as double is the default type for floating-point literals
     * - Use double for more precision and when dealing with larger numbers.
     *
     * Key Points:
     * - Floating-point types are used for numbers with fractional parts and require careful handling due to precision issues.
     * - The `float` type is less precise but consumes less memory compared to `double`.
     * - The `double` type is more precise and is typically used for most floating-point calculations.
     */

    public static void main(String[] args) {
        float a = 1.2345f; // 'f' suffix indicates a float literal
        double b = 1.2345; // 'd' suffix is optional for double literals

        // Displaying the values
        System.out.println("Float value: " + a);
        System.out.println("Double value: " + b);
    }
}

