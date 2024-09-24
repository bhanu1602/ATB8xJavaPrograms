package sept.ex_160924;

public class Task {

    /*
    Difference between = and ==?
    - "=" is an assignment operator used to assign a value to a variable. Example: int a = 10;
    - "==" is a comparison operator used to check whether two values are equal. Example: if (a == 10).

    How many bytes will be used when storing the following?
    - byte b = 10; (1 byte)
    - long l = 10L; (8 bytes)

    What is the result of performing byte b + byte c?
    - The result will be promoted to an int, as Java promotes byte, short, and char values to int during arithmetic operations.

    Example calculation:
        short s = 10;
        char c = 'A'; // The ASCII value of 'A' is 65

        int result = s + c; // 10 + 65 = 75
        System.out.println(result); // Outputs 75
     */

    public static void main(String[] args) {
        // Byte and Long
        byte b = 10;
        long l = 10L;

        System.out.println("Bytes used for 'b' (byte): 1 byte");  // byte uses 1 byte
        System.out.println("Bytes used for 'l' (long): 8 bytes"); // long uses 8 bytes

        // Arithmetic operation on bytes (result promoted to int)
        byte c = 10;
        byte d = 10;
        int result = b + c; // Byte addition is promoted to int
        System.out.println("Result of b + c (byte addition promoted to int): " + result); // Output: 20

        // Short and Char addition (char is implicitly converted to its ASCII value)
        short s = 10;
        char f = 'A'; // ASCII value of 'A' is 65
        int ss = s + f; // short + char results in int
        System.out.println("Result of s + f (short + char): " + ss); // Output: 75
    }
}

