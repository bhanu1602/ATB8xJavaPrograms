package Oct.ex_211024.WrapperClasses;

public class WrapperClassesExample {

    /*
    Notes:
    - Java provides wrapper classes for each primitive data type.
    - These wrapper classes allow us to treat primitive types as objects, enabling use in collections, synchronization, and other object-related operations.
    - The `valueOf()` method is used to convert primitives into their corresponding wrapper objects (autoboxing).
    - Wrapper classes also provide methods to convert from string to a primitive type or vice versa.
    */

    public static void main(String[] args) {

        // byte to Byte
        byte a = 1;
        Byte byteObj = Byte.valueOf(a);
        System.out.println("Byte Object: " + byteObj);

        // int to Integer
        int b = 10;
        Integer integerObj = Integer.valueOf(b);
        System.out.println("Integer Object: " + integerObj);

        // float to Float
        float c = 3.14f;
        Float floatObj = Float.valueOf(c);
        System.out.println("Float Object: " + floatObj);

        // double to Double
        double d = 3.14;
        Double doubleObj = Double.valueOf(d);
        System.out.println("Double Object: " + doubleObj);

        // char to Character
        char e = 'a';
        Character charObj = Character.valueOf(e);
        System.out.println("Character Object: " + charObj);

        // short to Short
        short f = 24;
        Short shortObj = Short.valueOf(f);
        System.out.println("Short Object: " + shortObj);

        // long to Long
        long l = 10000000000L;
        Long longObj = Long.valueOf(l);
        System.out.println("Long Object: " + longObj);

        // boolean to Boolean
        boolean bool = true;
        Boolean boolObj = Boolean.valueOf(bool);
        System.out.println("Boolean Object: " + boolObj);
    }
}

