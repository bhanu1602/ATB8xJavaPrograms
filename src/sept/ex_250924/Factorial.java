package sept.ex_250924;

import java.util.Scanner;

public class Factorial {
    //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to get factorial of a num ");
        int num = sc.nextInt();
        int i = 1;
        int fact = 1;

        while(i <= num){
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial of " + num + " is " + fact);

    }
}
