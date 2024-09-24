package sept.ex_230924;

import java.util.Scanner;

public class UnitConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the conversion type:");
        System.out.println("1: Kilometers to Miles");
        System.out.println("2: Celsius to Fahrenheit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                double kilometers = sc.nextDouble();
                double miles = kilometers * 0.621371;
                System.out.printf("%.2f kilometers is equal to %.2f miles.%n", kilometers, miles);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32; 
                System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
                break;
        }

        sc.close();
    }
}

