package Oct.ex_181024.Strings.Task;

public class ReverseString {

    // Reverse the String without using any functions. (for loop)

    public static void main(String[] args) {

        String name = "Alice";
        System.out.println("The name is: " + name);
        System.out.print("The reverse String is: "); // Print the reverse name

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i)); // Print each character
        }
    }
}

