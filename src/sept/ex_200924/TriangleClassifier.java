package sept.ex_200924;

import java.util.Scanner;

import java.util.Scanner;

public class TriangleClassifier {

    /*
     * Triangle Classifier (If-Else)
     *
     * Write a program that classifies a triangle based on its side lengths.
     *
     * Given three input values representing the lengths of the sides, determine if
     * the triangle is equilateral (all sides are equal), isosceles (exactly two
     * sides are equal), or scalene (no sides are equal).
     *
     * Use an if-else statement to classify the triangle.
     *
     * sideA, sideB, sideC
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of side A of the triangle:");
        double sideA = sc.nextDouble();
        System.out.println("Enter the length of side B of the triangle:");
        double sideB = sc.nextDouble();
        System.out.println("Enter the length of side C of the triangle:");
        double sideC = sc.nextDouble();

        // Classifying the triangle based on its sides
        if (sideA == sideB && sideB == sideC) {
            System.out.println("The triangle is Equilateral.");
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }
}

