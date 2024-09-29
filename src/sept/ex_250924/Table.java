package sept.ex_250924;

import java.util.Scanner;

public class Table {

    //Table of number n = 10, print table with For or while.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table to genarate");
        int num = sc.nextInt();

        int i = 1;

        while(i <= 100){
            System.out.println(num + " x " + i + " =  " + (num * i));
            i++;
        }

    }

}
