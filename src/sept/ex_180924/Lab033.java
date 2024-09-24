package sept.ex_180924;

public class Lab033 {

    // When performing arithmetic operations, `byte` and `char` are converted to `int`.
    // This is because Java promotes smaller data types (like `byte`, `short`, and `char`) to `int` during calculations.
    // Assignment operators like +=, -= can also be used with `char`.

    public static void main(String[] args) {

        char a = 'A'; // ASCII value of 'A' is 65
        char b = 'B'; // ASCII value of 'B' is 66

        int c = a + b; // 'A' (65) + 'B' (66) = 131

        System.out.println("Sum of characters 'A' and 'B' is: " + c); // Outputs 131
        System.out.println(a += 1); //gives takes +1 ASCII value
    }
}

