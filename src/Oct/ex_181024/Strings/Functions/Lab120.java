package Oct.ex_181024.Strings.Functions;

public class Lab120 {

    // Demonstrating various String functions

    public static void main(String[] args) {
        String name = "Bob Marley";

        // .length(): Returns the length of the string
        System.out.println(name.length());  // Output: 10

        // .toUpperCase(): Converts all characters to uppercase
        System.out.println(name.toUpperCase());  // Output: BOB MARLEY

        // .toLowerCase(): Converts all characters to lowercase
        System.out.println(name.toLowerCase());  // Output: bob marley

        // .charAt(int index): Returns the character at the specified index
        System.out.println(name.charAt(0));  // Output: B
        System.out.println(name.charAt(1));  // Output: o

        // .concat(String str): Concatenates the given string to the current string
        System.out.println(name.concat(" Is Super"));  // Output: Bob Marley Is Super

        // .contains(CharSequence s): Checks if the string contains the specified sequence
        System.out.println(name.contains("Super"));  // Output: false (since "Super" is not part of the original string)

        // .isEmpty(): Checks if the string is empty (length == 0)
        System.out.println(name.isEmpty());  // Output: false (since the string has characters)

        // .startsWith(String prefix): Checks if the string starts with the specified prefix
        System.out.println(name.startsWith("Bob"));  // Output: true

        // .endsWith(String suffix): Checks if the string ends with the specified suffix
        System.out.println(name.endsWith("Marley"));  // Output: true

        // .compareTo(String anotherString): Compares two strings lexicographically
        // Returns 0 if they are equal, a negative number if the original string is lexicographically less, and a positive number if greater.
        System.out.println(name.compareTo("Alice"));  // Output: a positive number (since "Bob Marley" > "Alice" lexicographically)
    }
}

