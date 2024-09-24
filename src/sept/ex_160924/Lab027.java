package sept.ex_160924;

public class Lab027 {
    // Relational Operators

    /*
    Notes:
    1. **Relational Operators**:
       - Used to compare two values.
       - Return a boolean value (`true` or `false`).
       - Commonly used in **loops** (e.g., `for`, `while`) and **conditional statements** (`if-else`).

    2. **List of Relational Operators**:
       - `>` : Greater than, returns true if the left operand is greater than the right operand.
       - `<` : Less than, returns true if the left operand is less than the right operand.
       - `>=` : Greater than or equal to, returns true if the left operand is greater than or equal to the right operand.
       - `<=` : Less than or equal to, returns true if the left operand is less than or equal to the right operand.
       - `==` : Equal to, returns true if both operands are equal.
       - `!=` : Not equal to, returns true if the operands are not equal.

    3. **Examples**:
       - `a > b` → Checks if `a` is greater than `b`.
       - `a < b` → Checks if `a` is less than `b`.
       - `a == b` → Checks if `a` is equal to `b`.
       - `a != b` → Checks if `a` is not equal to `b`.

    Concepts:
    - These operators are fundamental in decision-making structures and loops.
    - The comparison always results in a boolean (`true` or `false`), which is used to control the flow of the program.
    */

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        // Checking relational operators
        System.out.println("a > b: " + (a > b));  // false
        System.out.println("a < b: " + (a < b));  // true
        System.out.println("b >= c: " + (b >= c));  // false
        System.out.println("c <= a: " + (c <= a));  // false
        System.out.println("c == b: " + (c == b));  // false
        System.out.println("a != b: " + (a != b));  // true
    }
}

