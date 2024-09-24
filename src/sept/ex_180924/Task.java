package sept.ex_180924;

public class Task {

    /*
    Widening (Implicit and Explicit):
    - Widening is when a smaller data type is converted to a larger one. Implicit widening happens automatically, and explicit widening is done manually by the programmer.

    Narrowing (Implicit and Explicit):
    - Narrowing is when a larger data type is converted to a smaller one. It requires explicit casting and might result in data loss.

    Examples of both types are provided below.
     */

    public static void main(String[] args) {

        // Example for Widening (Implicit)
        byte b = 10;   // byte takes 1 byte of memory
        int c = b;     // Implicit widening: byte to int (4 bytes)
        System.out.println("Widening (Implicit): byte to int: " + c); // Output: 10

        // Example for Widening (Explicit) - unnecessary, but possible
        byte b2 = 20;
        long l = (long)b2; // Explicit widening (not necessary in this case, as it's automatically done)
        System.out.println("Widening (Explicit): byte to long: " + l); // Output: 20

        // Example for Narrowing (Explicit)
        double d = 134.4;   // double takes 8 bytes
        int e = (int)d;     // Narrowing from double to int (requires explicit cast, may cause data loss)
        System.out.println("Narrowing (Explicit): double to int: " + e); // Output: 134 (fractional part lost)

        // Example for Narrowing (Implicit not allowed)
        // Narrowing cannot happen implicitly, this will give an error:
        // int f = d; // Error: "cannot convert from double to int"

        // Arithmetic operations with pre-decrement and post-decrement

        int a = 10;
        // --a (pre-decrement) decreases value first, then uses the new value
        // a-- (post-decrement) uses the value first, then decreases it
        System.out.println("--a + a-- + a-- = " + (--a + a-- + a--)); // Output: 9 + 9 + 8 = 26
        System.out.println("Value of a after operations: " + a); // Output: 7

        int k = 10;
        // --k (pre-decrement) decreases first, k++ uses then increments, k-- uses then decrements
        System.out.println("--k + k++ + k-- = " + (--k + k++ + k--)); // Output: 9 + 9 + 10 = 28
        System.out.println("Value of k after operations: " + k); // Output: 9

        int f = 10;
        // f-- performs post-decrement operations
        System.out.println("f-- + f-- + f-- = " + (f-- + f-- + f--)); // Output: 10 + 9 + 8 = 27
        System.out.println("Value of f after operations: " + f); // Output: 7

    }
}

