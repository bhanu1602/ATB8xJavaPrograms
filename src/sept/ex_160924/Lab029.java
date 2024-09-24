package sept.ex_160924;

public class Lab029 {

    // Demonstrating the Logical NOT (!) operator

    /*
    Notes:
    1. **Logical NOT (`!`)**:
       - It is a **unary operator** that inverts the boolean value.
       - If the value is `true`, `!` makes it `false`, and if it is `false`, `!` makes it `true`.

    2. **Multiple NOT operators**:
       - Using multiple `!` operators in succession will toggle the boolean value.
       - Example: `!!` will return the original boolean value.

    3. **Examples in this program**:
       - `!a`: Negates the value of `a` which is `true`, making it `false`.
       - `!(1 > 20)`: Since `1 > 20` is `false`, applying `!` results in `true`.
       - `!!!(2 > 20)`: This applies multiple negations to the expression. First, `2 > 20` is `false`, `!false` is `true`, `!true` is `false`, and `!false` is `true`.

    Concepts:
    - Logical NOT `!` flips the boolean result.
    - Applying it multiple times can toggle the value multiple times, but an even number of `!` operators will restore the original value.
    */

    public static void main(String[] args) {
        boolean a = true;

        // Negating the value of `a`
        System.out.println(!a);           // Output: false

        // Negating the result of a comparison (1 > 20 is false, so !false is true)
        System.out.println(!(1 > 20));    // Output: true

        // Applying multiple negations (2 > 20 is false, so !!!false is true)
        System.out.println(!!!(2 > 20));  // Output: true
    }
}

