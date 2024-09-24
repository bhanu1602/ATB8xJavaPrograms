package sept.ex_180924;

public class Lab032 {

    // This class demonstrates how much memory (in bytes) certain data types take.

    byte a = 10;  // A byte takes 1 byte (8 bits) of memory
    long l = 10L; // A long takes 8 bytes (64 bits) of memory

    public static void main(String[] args) {

        Lab032 obj = new Lab032();

        // Displaying the memory usage of each variable
        System.out.println("Memory taken by byte 'a': " + Byte.BYTES + " byte");
        System.out.println("Memory taken by long 'l': " + Long.BYTES + " bytes");
    }
}

