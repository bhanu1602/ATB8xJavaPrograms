package sept.ex_160924;

public class Lab025 {

    /*
    Notes:
    1. **String Concatenation and Arithmetic Order**:
       - In Java, the `+` operator is overloaded to work for both string concatenation and arithmetic operations.
       - When mixing strings and numbers in the same expression, Java follows the order of evaluation from left to right.
       - If a string is encountered first, all subsequent `+` operations will result in concatenation (treating numbers as strings).
       - If numbers are encountered first, arithmetic operations are performed before any string concatenation.

    2. **Order of Operations**:
       - Java evaluates expressions from left to right. However, parentheses `()` can alter the order of operations, ensuring certain parts of the expression are evaluated first.
       - If an arithmetic operation needs to happen before string concatenation, it should be enclosed in parentheses.

    3. **Example Explanations**:
       - `System.out.println(firstName + lastName + a + b);`
         - Concatenation starts with strings. Both `a` and `b` are treated as strings, so the result is: `RajKumar1020`.
       - `System.out.println(a + b + firstName + lastName);`
         - Arithmetic is performed first (`a + b` = 30). Then, concatenation happens with the result and the strings: `30RajKumar`.
       - `System.out.println(firstName + lastName + (a + b));`
         - Parentheses force the arithmetic to happen first (`a + b` = 30). Then, concatenation happens: `RajKumar30`.

    Concepts:
    - **Operator Overloading in Java**: The `+` operator works for both arithmetic (when applied to numbers) and string concatenation (when applied to strings).
    - **Parentheses in Expressions**: Parentheses `()` can alter the order of evaluation and are useful when mixing numbers and strings to control what happens first.
    */

    public static void main(String[] args) {

        String firstName = "Raj";
        String lastName = "Kumar";

        int a = 10;
        int b = 20;

        // Concatenation happens as the first two operands are strings
        System.out.println(firstName + lastName + a + b); // Output: RajKumar1020

        // Arithmetic is performed first since both operands are integers
        System.out.println(a + b + firstName + lastName); // Output: 30RajKumar

        // Parentheses ensure the arithmetic happens before concatenation
        System.out.println(firstName + lastName + (a + b)); // Output: RajKumar30

    }
}

