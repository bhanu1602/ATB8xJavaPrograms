package Oct.ex_211024.WrapperClasses;

public class Extra {

    public static void main(String[] args) {

        // Wrapper classes allow null values, whereas primitive types don't.
        Integer nullableValue = null;
        // Nullable value - can be null, unlike primitive int.
        System.out.println("nullableValue: " + nullableValue); // This will print 'null'

        // Methods of wrapper classes

        // Max and min constants of Integer wrapper class
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue: " + maxValue); // Prints 2147483647 (max value for int)
        int minValue = Integer.MIN_VALUE;
        System.out.println("minValue: " + minValue); // Prints -2147483648 (min value for int)

        // Boolean wrapper class with predefined constants TRUE and FALSE
        boolean boolValue = Boolean.TRUE;
        System.out.println("boolValue: " + boolValue); // Prints 'true'

        // Maximum value for Long type
        long longValue = Long.MAX_VALUE;
        System.out.println("longValue: " + longValue); // Prints 9223372036854775807 (max value for long)

        // Comparing wrapper class objects using equals() and ==
        Integer one = 100;
        Integer two = 100;

        // equals() compares the actual content (values)
        System.out.println("Using equals(): " + one.equals(two)); // True, as both have the same value

        // == compares reference equality (addresses), but due to Integer caching, it will return true for small integers
        System.out.println("Using == : " + (one == two)); // True for integers in range [-128, 127], due to caching

        // For larger values, caching does not apply, so == returns false even if the values are the same.
        Integer largeOne = 128;
        Integer largeTwo = 128;
        System.out.println("Using equals() for large values: " + largeOne.equals(largeTwo)); // True, content is the same
        System.out.println("Using == for large values: " + (largeOne == largeTwo)); // False, different object references

        // Exploring more methods of wrapper classes

        // Parsing a String to primitive using wrapper class method
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("Parsed int from String: " + number); // Converts "123" to int 123

        // Converting primitive to String using toString()
        String intToString = Integer.toString(456);
        System.out.println("Converted int to String: " + intToString); // Converts int 456 to "456"

        // Checking whether the value is a number
        boolean isDigit = Character.isDigit('5');
        System.out.println("Is '5' a digit? " + isDigit); // True

        // Getting the character's numeric value
        int numericValue = Character.getNumericValue('A');
        System.out.println("Numeric value of 'A': " + numericValue); // Returns 10, as 'A' is treated as hex value

        // Other common wrapper class methods
        // Boxing (primitive to object) and Unboxing (object to primitive)
        Integer autoBoxedInt = 10; // Autoboxing
        int unboxedInt = autoBoxedInt; // Unboxing
        System.out.println("Autoboxed Integer: " + autoBoxedInt); // 10
        System.out.println("Unboxed Integer: " + unboxedInt); // 10

        // Example of Double object comparison
        Double doubleObj1 = 10.5;
        Double doubleObj2 = 10.5;
        System.out.println("Double equals: " + doubleObj1.equals(doubleObj2)); // True, compares values
        System.out.println("Double ==: " + (doubleObj1 == doubleObj2)); // False, compares references for larger objects
    }
}

