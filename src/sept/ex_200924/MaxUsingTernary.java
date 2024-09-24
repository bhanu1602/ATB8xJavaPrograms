package sept.ex_200924;

import java.util.Scanner;

public class MaxUsingTernary {

    /*
    By using Ternary Operators, find the maximum between 3 numbers.
    Input: int a, b, c - a = 10, b = 20, c = 45
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        // Using ternary operators to find the maximum value
        int max = (a > b) ? (Math.max(a, c)) : (b > c ? b : c);

        System.out.println("Maximum value is: " + max);
    }
}

