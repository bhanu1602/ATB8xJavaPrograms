package sept.ex_130924;

public class Lab017 {

    // Integer Literals in Java

    /*
     * Integer literals can be represented in multiple ways:
     *
     * 1. Decimal Literals (Base 10):
     *    - The most commonly used format.
     *    - Digits are written in base 10 (0-9).
     *    - Example: int decimal = 100;
     *
     * 2. Octal Literals (Base 8):
     *    - Digits are written in base 8 (0-7).
     *    - Octal literals start with a leading zero (0).
     *    - Example: int octal = 010; // Represents 8 in decimal
     *
     * 3. Hexadecimal Literals (Base 16):
     *    - Digits are written in base 16 (0-9, A-F or a-f).
     *    - Hexadecimal literals start with a leading "0x" or "0X".
     *    - Example: int hex = 0x1A; // Represents 26 in decimal
     *
     * 4. Binary Literals (From Java 7, Base 2):
     *    - Digits are written in base 2 (0-1).
     *    - Binary literals start with a leading "0b" or "0B".
     *    - Example: int binary = 0b1010; // Represents 10 in decimal
     */

    public static void main(String[] args) {

        // Decimal literal (Base 10)
        int decimal = 100;

        // Octal literal (Base 8)
        int octal = 010;  // In decimal, this is equivalent to 8

        // Hexadecimal literal (Base 16)
        int hex = 0x1A;  // In decimal, this is equivalent to 26

        // Binary literal (Base 2)
        int binary = 0b1010;  // In decimal, this is equivalent to 10

        // Print all values to see their decimal representations
        System.out.println("Decimal literal: " + decimal);
        System.out.println("Octal literal: " + octal);
        System.out.println("Hexadecimal literal: " + hex);
        System.out.println("Binary literal: " + binary);

    }
}

