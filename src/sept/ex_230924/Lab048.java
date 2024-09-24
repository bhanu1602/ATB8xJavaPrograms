package sept.ex_230924;

import java.util.Scanner;

import java.util.Scanner;

public class Lab048 {
    // Switch-case example to determine the day of the week

    /*
     * It executes only one statement based on the matching condition.
     * It is an alternative to if-else statements.
     * It works with primitive data types: byte, char, int, short, enums, String,
     * and their wrapper classes.
     * From JDK 7 onwards, it supports Enums, Strings, and Wrapper classes.
     *
     * Syntax:
     * switch(condition){
     * case 1:
     * // statements
     * break;
     * ...
     * default:
     * // default statements
     * }
     */

    public static void main(String[] args) {

        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7 to find the corresponding day of the week: ");

        // Taking the day number as input
        int day = sc.nextInt();

        // Switch-case to handle different days
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                // This block will execute if the input doesn't match any of the cases
                System.out.println("Invalid day! Please enter a number between 1 and 7.");
        }
    }
}
