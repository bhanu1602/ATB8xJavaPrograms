package Oct.ex_251024.Arrays;

public class Lab137 {

    // Types of arrays

    /*
    Notes:
    1. One-Dimensional Array:
       - A linear array with a single row.
       - Syntax: `int[] array = {elements};`

    2. Multi-Dimensional Arrays:
       - Commonly used as 2D arrays (matrices) but can have more dimensions.
       - Syntax: `int[][] array = { {row1_elements}, {row2_elements}, ... };`
       - Arrays of different lengths in each row are called "jagged arrays".

    3. Example uses:
       - Storing data in a structured format like matrices.
       - Useful for representing tables, grids, and graphs.
     */

    public static void main(String[] args) {

        // One-dimensional array (1D)
        int[] marks = {2, 36, 45, 58};
        System.out.println("1D Array (marks):");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        // Two-dimensional arrays (2D)
        int[][] matrix3x3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 3x3 matrix
        int[][] matrix3x2 = {{1, 2}, {3, 4}, {5, 6}};           // 3x2 matrix
        int[][] matrix3x1 = {{1}, {4}, {6}};                    // 3x1 matrix

        System.out.println("\n\n2D Array (3x3 matrix):");
        for (int i = 0; i < matrix3x3.length; i++) {
            for (int j = 0; j < matrix3x3[i].length; j++) {
                System.out.print(matrix3x3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n2D Array (3x2 matrix):");
        for (int i = 0; i < matrix3x2.length; i++) {
            for (int j = 0; j < matrix3x2[i].length; j++) {
                System.out.print(matrix3x2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n2D Array (3x1 matrix):");
        for (int[] ints : matrix3x1) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

