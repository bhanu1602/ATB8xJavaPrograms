package sept.ex_230924;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the arithmetic to perform on numbers: ");
        String c = sc.next();


        switch(c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enter valid operator");
        }

        sc.close();

    }


}
