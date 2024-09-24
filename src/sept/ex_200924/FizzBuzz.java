package sept.ex_200924;

public class FizzBuzz {

    /*
    FizzBuzz Test:
    Write a program that prints numbers from 1 to 100.
    However, for multiples of 3, print "Fizz" instead of the number,
    and for multiples of 5, print "Buzz".
    For numbers that are multiples of both 3 and 5, print "FizzBuzz".
    */

    public static void main(String[] args) {

        // Print numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // Check for multiples of both 3 and 5 first
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                // Check for multiples of 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                // Check for multiples of 5
                System.out.println("Buzz");
            } else {
                // For all other numbers, print the number itself
                System.out.println(i);
            }
        }
    }
}

