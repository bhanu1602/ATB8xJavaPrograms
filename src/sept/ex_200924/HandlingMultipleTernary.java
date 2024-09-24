package sept.ex_200924;

import java.util.Scanner;

public class HandlingMultipleTernary {

    public static void main(String[] args) {
        char grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = sc.nextInt();

        // Using if-else statements to determine the grade
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        } else if (score >= 0) {
            grade = 'F';
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            sc.close();
            return; // Exit if score is invalid
        }

        System.out.println("The score is " + score + " and the grade is " + grade);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

