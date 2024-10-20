package Oct.ex_181024.Strings.Task;

import java.util.Scanner;

import java.util.Scanner;

public class Palindrome {

    /*
    Palindrome Check

    Input : str = "abba"
    Output: Yes

    Input : str = "pramod"
    Output: No
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Initialize scanner to read user input
        System.out.println("Enter a string: ");
        String s = sc.nextLine(); // Capture the input string

        StringBuilder str = new StringBuilder(s);
        String reverse = str.reverse().toString(); // Reverse the input string

        if (s.equals(reverse)) { // Check if original string equals the reversed string
            System.out.println("Yes"); // If equal, it's a palindrome
        } else {
            System.out.println("No"); // If not equal, it's not a palindrome
        }
    }
}

