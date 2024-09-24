package sept.ex_160924;

public class Lab028 {

    // Logical Operators

    /*
    Notes:
    1. **Logical Operators**:
       - These operators are used to combine multiple boolean expressions.
       - Return `true` or `false` based on the logical relationships.

    2. **Types of Logical Operators**:
       - `&&` (Logical AND): Returns `true` if **both** conditions are `true`.
         - Example: `x && y` will return `true` only if both `x` and `y` are `true`.
       - `||` (Logical OR): Returns `true` if **at least one** condition is `true`.
         - Example: `x || y` will return `true` if either `x` or `y` is `true`.
       - `!` (Logical NOT): Reverses the condition. Returns `true` if the condition is `false`, and `false` if the condition is `true`.
         - Example: `!y` will return `true` if `y` is `false`.

    3. **Use Cases**:
       - Logical operators are mainly used in **control flow** (like `if-else`, loops) to evaluate complex conditions.
       - Example: Checking if both `x` and `y` are true (`x && y`), or if at least one of them is true (`x || y`).

    Concepts:
    - Logical operators allow for **compound conditions**.
    - They are often used for decision-making and validation scenarios.
    */

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        // Logical AND: Returns true only if both x and y are true
        System.out.println("x && y: " + (x && y));  // false

        // Logical OR: Returns true if at least one of x or y is true
        System.out.println("x || y: " + (x || y));  // true

        // Logical NOT: Reverses the value of y
        System.out.println("!y: " + (!y));  // true
    }
}

