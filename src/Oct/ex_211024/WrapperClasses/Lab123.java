package Oct.ex_211024.WrapperClasses;

import java.util.ArrayList;

public class Lab123 {

    // Autoboxing

    /*
    Notes:

    - Autoboxing is the automatic conversion of primitive data types to their corresponding wrapper class objects.
    - Java performs this conversion implicitly where necessary.
    - Autoboxing helps when primitives need to be treated as objects, such as in collections (e.g., ArrayList, HashSet) which store objects, not primitives.

    Example:
    Primitive char 'a' -> Wrapper class Character
    Primitive int -> Wrapper class Integer
    */

    public static void main(String[] args) {

        // Primitive type
        char ch = 'a';
        System.out.println("Primitive Character: " + ch);

        // Autoboxing: automatic conversion from char (primitive) to Character (wrapper class)
        Character a = ch;
        System.out.println("Autoboxed Character: " + a);

        // Using ArrayList (which stores only objects)
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing: primitive '1' is automatically converted to Integer object
        arrayList.add(1);

        System.out.println("ArrayList after autoboxing: " + arrayList);
    }
}

class Lab124 {

    // Unboxing

    /*
    Notes:

    - Unboxing is the reverse of autoboxing: the automatic conversion of wrapper class objects to their corresponding primitive types.
    - Java performs unboxing when an object needs to be treated as a primitive.
    - For example, when retrieving values from a collection that holds wrapper class objects, unboxing occurs automatically to convert the objects back to primitives.

    Example:
    Wrapper class Character -> Primitive char
    Wrapper class Integer -> Primitive int
    */

    public static void main(String[] args) {

        // Wrapper class object
        Character ch = 'a';
        System.out.println("Wrapper Character: " + ch);

        // Unboxing: automatic conversion from Character (wrapper class) to char (primitive)
        char a = ch;
        System.out.println("Unboxed Character: " + a);

        // Using ArrayList (stores Integer objects)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // Autoboxing: '1' is autoboxed to an Integer object

        System.out.println("ArrayList: " + arrayList);

        // Unboxing: retrieving Integer from ArrayList and converting it to primitive int
        int num = arrayList.get(0);
        System.out.println("Unboxed Integer: " + num);
    }
}

