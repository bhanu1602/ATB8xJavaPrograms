package sept.ex_250924;

public class Lab074 {

    // Nested for loop
    /*
    A nested for loop is a loop within another loop.
    The outer loop runs once for each iteration of the inner loop.

    Key Points about Nested Loops:
    - The inner loop executes completely for each iteration of the outer loop.
    - Nested loops are commonly used for working with multi-dimensional arrays,
      generating patterns, or performing operations that require two levels of iteration.
    - Be mindful of performance, as nested loops can lead to increased time complexity.
    - The total number of iterations is the product of the iterations of the outer
      and inner loops (e.g., outer loop: n iterations, inner loop: m iterations
      results in n * m total iterations).
    */

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Outer loop (runs 5 times)
            for (int j = 0; j < 5; j++) { // Inner loop (also runs 5 times)
                System.out.print(j + " "); // Print value of j
            }
            System.out.println(); // Move to the next line after inner loop completes
        }
    }
}

