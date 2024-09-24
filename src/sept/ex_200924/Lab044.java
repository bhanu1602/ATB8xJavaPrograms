package sept.ex_200924;

public class Lab044 {

    public static void main(String[] args) {
        boolean a = true; // Initialize boolean variable 'a' to true
        a = !a; // Negate the value of 'a'

        // Conditional check
        if (2 + 2 < 4) {
            System.out.println("Inside the loop"); // This block won't execute as the condition is false
        }

        // Output the value of 'a'
        System.out.println("Outside the loop: " + a); // 'a' is false due to negation
    }
}

