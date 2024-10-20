package Oct.ex_181024.Strings.Functions;

public class Lab119 {
    // Demonstrating the difference between == and equals() in String comparison

    public static void main(String[] args) {
        String s1 = "Mary";  // String literal
        String s2 = "John";  // Another string literal

        // Using '==': Compares the references (memory location)
        // s1 and s2 are different string literals, so they point to different memory locations
        System.out.println(s1 == s2);  // Output: false

        // Using 'equals()': Compares the content (actual value) of the strings
        // Since the content of s1 ("Mary") and s2 ("John") are different, this returns false
        System.out.println(s1.equals(s2));  // Output: false
    }
}

