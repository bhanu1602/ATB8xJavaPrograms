package sept.ex_230924;

import java.util.Scanner;

public class Lab049 {

    //without break stament it executes all the conditions until it finds break

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

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

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
        }
        System.out.println("End of the loop");
    }
}
