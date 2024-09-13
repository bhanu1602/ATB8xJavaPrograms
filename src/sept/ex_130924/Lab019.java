package sept.ex_130924;

public class Lab019 {

    // Floating Literals and Null Literals

    /*
     * Floating Literals:
     * - Represent fractional or decimal values.
     * - By default, floating-point literals are of type `double` (64 bits).
     * - To indicate a literal as a `float` (32 bits), append the literal with `f` or `F`.
     * - Floating-point literals can be written in decimal form or scientific notation (exponential form).
     * - Decimal example: 3.14159
     * - Scientific notation example: 1.23e2 (which means 1.23 * 10^2 or 123.0)
     * - Example: float pi = 3.14f; double radius = 6371.0;
     *
     * Null Literals:
     * - The `null` literal represents the absence of a value or object reference.
     * - It is commonly used with reference types such as objects, arrays, or strings.
     * - `null` can only be assigned to reference types, not primitive types.
     * - Example: String str = null;
     * - The use of `null` helps in error handling and checking whether an object has been initialized or not.
     *
     * Special notes:
     * - Trying to access or use an object that has a `null` reference will result in a `NullPointerException`.
     * - It's a good practice to always check for `null` before performing operations on objects.
     */

    public static void main(String[] args) {

        // Example of floating literals
        float floatNumber = 3.14159f;   // float literal, note the 'f' suffix
        double doubleNumber = 6.022e23; // double literal in scientific notation

        System.out.println("Float value: " + floatNumber);
        System.out.println("Double value: " + doubleNumber);

        // Example of null literal
        String name = null;             // null literal, meaning no value is assigned to `name`

        System.out.println(name);
    }
}

