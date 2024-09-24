package sept.ex_180924;

public class Lab034 {

    // Type casting - converting from one data type to another data type

    /*
     * Assigning a value from one primitive data type to another type
     * Syntax: int a = (short)a;
     *
     * Two types:
     * a) Widening type casting (Implicit casting)
     *    - Converting from a smaller data type to a larger one.
     *    - No data loss occurs.
     *    - Byte -> Short -> Int -> Long -> Float -> Double
     *
     * b) Narrowing type casting (Explicit casting)
     *    - Converting from a larger data type to a smaller one.
     *    - May result in data loss.
     *    - Requires explicit type casting by the programmer.
     */

    public static void main(String[] args) {
        // Widening type casting
        byte b = 10;
        int a = b; // Widening type casting (automatic casting done by JVM)

        System.out.println("Widening casting: byte to int");
        System.out.println("byte value: " + b);
        System.out.println("int value after widening: " + a);

        // Narrowing type casting
        double d = 23.44;
        // int e = d; // Uncommenting this will throw an error, as narrowing requires explicit casting.
        int f = (int) d; // Narrowing type casting (manual casting done by the programmer)

        System.out.println("\nNarrowing casting: double to int");
        System.out.println("double value: " + d);
        System.out.println("int value after narrowing: " + f); // Results in data loss (fractional part lost)

    }
}


