package sept.ex_160924;

public class Lab026 {
    // Assignment Operators

    /*
    Notes:
    1. **Assignment Operators**:
       - Used to assign a value to a variable.
       - They have **right-to-left associativity**, meaning the value on the right-hand side is assigned to the left-hand side.
       - The value or expression on the right must be evaluated before assigning it to the variable on the left.

    2. **Compound Assignment Operators**:
       - These operators perform a mathematical operation and assignment in one step.
       - Example: `a += 10` is equivalent to `a = a + 10`.

       - **List of Compound Assignment Operators**:
         - `+=` : Add the right operand to the left operand and assign the result to the left operand.
         - `-=` : Subtract the right operand from the left operand and assign the result.
         - `*=` : Multiply the left operand by the right operand and assign the result.
         - `/=` : Divide the left operand by the right operand and assign the result.
         - `%=` : Find the remainder (modulus) of the division of the left operand by the right operand and assign the result.

    3. **Examples**:
       - `a += 10;` → Adds 10 to `a` and assigns the result to `a`.
       - `a -= 5;` → Subtracts 5 from `a` and assigns the result to `a`.

    Concepts:
    - **Right-to-left associativity**: The right-hand side expression is evaluated first before the assignment is made.
    - **Compound operations**: A shorthand that simplifies mathematical operations combined with assignment.
    */

    public static void main(String[] args) {

        int a = 10;
        a += 10; // a = a + 10
        System.out.println(a); // Output: 20

        a -= 5; // a = a - 5
        System.out.println(a); // Output: 15

        a *= 2; // a = a * 2
        System.out.println(a); // Output: 30

        a /= 3; // a = a / 3
        System.out.println(a); // Output: 10

        a %= 4; // a = a % 4
        System.out.println(a); // Output: 2
    }
}

