package sept.ex_110924;

public class Lab008 {

    // Numerical Type or Integral Type

    /*
     * Java provides several integral types to represent whole numbers. The primary integral types are:
     *
     * byte:
     * - Size: 8 bits (1 byte)
     * - Range: -128 to 127
     * - Example: byte b = 100; // 'b' can hold values from -128 to 127
     *
     * short:
     * - Size: 16 bits (2 bytes)
     * - Range: -32,768 to 32,767
     * - Example: short s = 100; // 's' can hold values from -32,768 to 32,767
     *
     * int:
     * - Size: 32 bits (4 bytes)
     * - Range: -2^31 to 2^31-1 (-2,147,483,648 to 2,147,483,647)
     * - Example: int i = 100; // 'i' can hold values from -2,147,483,648 to 2,147,483,647
     *
     * long:
     * - Size: 64 bits (8 bytes)
     * - Range: -2^63 to 2^63-1 (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
     * - Example: long l = 100; // 'l' can hold values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *
     * char:
     * - Size: 16 bits (2 bytes)
     * - Range: 0 to 65,535 (represents Unicode characters)
     * - Example: char c = 'a'; // 'c' can hold any single character or Unicode value
     *
     * Key Points:
     * - The integral types are used for representing whole numbers of different sizes.
     * - Use the smallest data type that can hold the values you need to optimize memory usage.
     * - The 'char' type is unique as it represents a single 16-bit Unicode character and is often used for character operations.
     */

    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;
        char c = 'a';

        // Displaying the values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Char value: " + c);
    }
}

