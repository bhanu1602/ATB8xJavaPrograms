package sept.ex_250924;

public class Lab064 {

    // Data types supported by for loop

    /*
    Notes:
    1. **Numerical data types in a for loop**:
       - The for loop supports all numerical data types: `int`, `short`, `long`, `float`, `double`, and `char`.
       - You can use these data types for the initialization and control expressions in the for loop.
       - However, keep in mind that floating-point types (`float`, `double`) may not always behave as expected due to precision issues.

    2. **Example of valid data types**:
       - The following for loops demonstrate the use of `float`, `long`, and `char` in the loop control variable.
       - `char` is also considered as a numerical data type because it internally holds integer values representing characters.

    3. **Important Points**:
       - When using floating-point types (`float` and `double`), the loop termination condition should account for the imprecision in decimal values.
       - Always ensure that the loop condition and update expression work well with the chosen data type, as floating-point comparisons may sometimes be imprecise.
    */

    public static void main(String[] args) {

        // Using float in a for loop
        for (float i = 0.0f; i < 10.67f; i++) {
            System.out.println(i);
        }

        // Using long in a for loop
        for (long i = 0; i < 10 ; i++) {
            System.out.println(i);
        }

        // Using double in a for loop
        for (double i = 0.0; i < 10.67; i++) {
            System.out.println(i);
        }

        // Using char in a for loop
        for (char ch = 'a'; ch < 'h'; ch++) {
            System.out.println(ch); // Prints characters from 'a' to 'g'
        }
    }
}

