package Oct.ex_211024.WrapperClasses;

public class Lab122 {

    // Wrapper Classes in Java

    /*
    Notes:
    - Wrapper classes are used to treat primitive data types as objects.
    - Java has primitive data types (e.g., int, char, etc.) and object-oriented types, and wrapper classes allow primitives to be treated like objects.
    - Wrapper classes "wrap" primitive types into an object, making them usable where objects are required.
    - Wrapper classes allow primitives to be stored in data structures like `ArrayList`, `HashSet`, etc., which can only store objects.
    - Since Java is not a purely Object-Oriented Programming (OOP) language, due to the presence of primitive data types, wrapper classes help bridge this gap.
    - Key Features:
      - **Autoboxing**: Automatic conversion of primitive data types into their corresponding wrapper class objects.
      - **Unboxing**: Automatic conversion of wrapper class objects back into primitive types.
    - Wrapper classes are useful when you need synchronization, null handling, or compatibility with collections.

    Wrapper Classes and their corresponding primitive types:
    - `char`    -> `Character`
    - `byte`    -> `Byte`
    - `short`   -> `Short`
    - `int`     -> `Integer`
    - `long`    -> `Long`
    - `float`   -> `Float`
    - `double`  -> `Double`
    - `boolean` -> `Boolean`

    */

    public static void main(String[] args) {

        // Example: Using Wrapper Classes

        // Primitive type
        int a = 10;

        // Converting primitive type 'a' into a wrapper object (Autoboxing)
        Integer b = a;

        System.out.println("Primitive int a: " + a);
        System.out.println("Wrapper Integer b: " + b);

    }
}

