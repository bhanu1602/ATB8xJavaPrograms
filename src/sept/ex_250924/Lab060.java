package sept.ex_250924;

public class Lab060 {

    /*
Notes:
1. Valid Variable Names:
   - Variables in `for` loops can follow the general variable naming rules in Java.
   - Valid names can start with a letter, underscore (`_`), or dollar sign (`$`). They cannot start with digits.
   - Examples of valid variable names: `i`, `_1`, `$counter`, `ankit`.
   - Avoid using non-descriptive names like `_1` in production code for clarity.

2. Valid Data Types:
   - You can use the following data types for loop control variables:
     - `int` (most common)
     - `char`
     - `short`
     - `byte`
     - `long` (though not commonly used for loops)

   - Example of a `char` loop: `for (char c = 'a'; c <= 'z'; c++) { ... }`

3. Invalid Data Types:
   - Data types that should NOT be used for typical `for` loops include:
     - `boolean`: Cannot be used as a loop counter (since it has only two values: `true` and `false`).
     - `float` and `double`: Floating-point numbers are not suitable due to precision issues when iterating.
     - Objects: Objects can be used in enhanced `for` loops or with custom logic, but not for standard counting.
*/

    public static void main(String[] args) {

        // Example 1: Using a variable with an underscore and digits
        for (int _1 = 0; _1 < 10; _1++) { // valid variable name (starts with underscore)
            System.out.println(_1);
        }

        // Example 2: Using a meaningful variable name (e.g., 'ankit')
        for (int ankit = 0; ankit < 10; ankit++) {
            System.out.println(ankit);
        }
    }


}
