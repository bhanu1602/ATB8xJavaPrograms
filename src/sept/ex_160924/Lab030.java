package sept.ex_160924;

public class Lab030 {

    // Declaring instance variables a and b
    int a = 10;
    int b = 20;

    // Arithmetic operators: Used to perform basic mathematical operations
    public void arithmetic() {
        System.out.println(a + b); // Addition
        System.out.println(a - b); // Subtraction
        System.out.println(a * b); // Multiplication
        System.out.println(a / b); // Division (integer division)
        System.out.println(a % b); // Modulus (remainder of division)
    }

    // Assignment operators: Used to assign values to variables, also includes compound assignment
    public void assignment() {
        System.out.println(a += b); // a = a + b
        System.out.println(a -= b); // a = a - b
        System.out.println(a *= b); // a = a * b
        System.out.println(a /= b); // a = a / b
        System.out.println(a %= b); // a = a % b
    }

    // Relational operators: Used to compare two values, returns boolean (true or false)
    public void relational() {
        System.out.println(a > b);  // Greater than
        System.out.println(a < b);  // Less than
        System.out.println(a <= b); // Less than or equal to
        System.out.println(a >= b); // Greater than or equal to
        System.out.println(a != b); // Not equal to
        // System.out.println(!b); // Invalid: Logical NOT works only with boolean, not int
        System.out.println(a == b); // Equal to
    }

    // Logical operators: Used to perform logical operations, primarily with boolean expressions
    public void logical() {
        System.out.println(a > b && a < b);   // Logical AND: returns true if both conditions are true
        System.out.println(a < b || a < b);   // Logical OR: returns true if at least one condition is true
        // System.out.println(a <= b !a > b); // Invalid syntax for negation, correct would be ! (not) operator
    }

    // new operator: Used to create new objects in memory
    public void newOperator() {
        String name = new String("ABC");  // Creating a new String object
        System.out.println(name);         // Output: ABC

        Object s1 = new Object();         // Creating a new Object instance
        System.out.println(s1 instanceof String); // Checking if s1 is an instance of String, returns false
    }

}
