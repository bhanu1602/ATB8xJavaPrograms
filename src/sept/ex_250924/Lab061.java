package sept.ex_250924;

public class Lab061 {

    public static void main(String[] args) {
        // The initialization is 'int x = 0', and the test expression is 'x > 1'.
        // The loop will only execute if the test expression is true.
        // Since 'x' starts at 0 and 0 is NOT greater than 1, the loop condition is false at the very beginning.
        // Therefore, the loop doesn't execute even once, and no output is printed.

        for (int x = 0; x > 1; x++) {
            System.out.println(x); // This code does not execute because the test expression is false.
        }
    }
}
