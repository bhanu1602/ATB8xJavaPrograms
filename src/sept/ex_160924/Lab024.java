package sept.ex_160924;

public class Lab024 {

    // Arithmetic operations on Strings

    /*
     * The + operator is used for concatenating two strings. The same + is used to add integers.
     * When working with strings containing numeric characters, you can convert them to integers for arithmetic operations.
     * This conversion from string to integer is called type conversion.
     */

    public static void main(String[] args) {

        String firstName = "Raj";
        String lastName = "Kumar";

        // Concatenating two strings using +
        System.out.println(firstName + " " + lastName); // Output: Raj Kumar

        String a = "10";
        String b = "20";

        // Converting the string numbers to integers using Integer.parseInt()
        int a1 = Integer.parseInt(a);
        int a2 = Integer.parseInt(b);

        // Performing arithmetic operations after conversion
        System.out.println(a1 + a2); // Output: 30 (addition of integers)
    }
}

