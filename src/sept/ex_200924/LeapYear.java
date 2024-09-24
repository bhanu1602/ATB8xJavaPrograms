package sept.ex_200924;

import java.util.Scanner;

import java.util.Scanner;

public class LeapYear {

    // Leap Year Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to find out if it is a leap year:");
        int year = sc.nextInt();

        // Check for leap year using the correct conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
    }
}

