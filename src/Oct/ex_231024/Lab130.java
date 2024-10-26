package Oct.ex_231024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab130 {

    // finally block

    /*
    Notes:

    - **finally block**:
      - The `finally` block is always executed after the `try` and `catch` blocks, whether an exception is thrown or not.
      - The primary purpose of the `finally` block is to ensure that resources are closed or cleaned up (like closing files, database connections, etc.).
      - Even if an exception is thrown or a `return` statement is encountered in the `try` or `catch` block, the `finally` block will still execute.

    - The only exception to this rule is when `System.exit(0)` is called, which terminates the JVM and prevents the `finally` block from executing.

    */

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("c://dummyfile.txt");  // This will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found");  // Handles the exception if the file is not found
        } finally {
            System.out.println("Finally block executed");  // Always executed, even if no exception is thrown
        }

        // System.exit(0); // Uncomment this to prevent the finally block from executing
    }
}

