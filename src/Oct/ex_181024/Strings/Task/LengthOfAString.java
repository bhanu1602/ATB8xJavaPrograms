package Oct.ex_181024.Strings.Task;

public class LengthOfAString {

    // Calculate the length of the String -
    // without using the length() function.

    public static void main(String[] args) {
        String name = "Alice"; // Passed String
        int count = 0; // Count for characters

        // Convert the string into a character array
        char[] charArray = name.toCharArray();

        // Iterate through the array and count the characters
        for (char c : charArray) {
            count++;
        }

        System.out.println("Length of the string is: " + count);
    }
}

