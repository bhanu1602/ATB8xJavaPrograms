package sept.ex_200924;

import java.util.Scanner;

public class HandlingMultipleTernaryAl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = sc.nextInt();

        // Using ternary operators to determine the grade
        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" :
                                (score >= 60) ? "D" :
                                        (score >= 50) ? "E" : "F";

        System.out.println("The score is " + score + " and the grade is " + grade);

        // Optional: Check for pass/fail status
        if (score < 50) {
            System.out.println("You are fail.");
        }
    }
}

