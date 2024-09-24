package sept.ex_200924;

public class Lab038 {

    public static void main(String[] args) {

        // Using the ternary operator to compare two variables

        int tushar = 10;
        int nickel = 12;

        // The ternary operator compares whether 'tushar' is greater than 'nickel'
        // If the condition (tushar > nickel) is true, it will return 'nickel'
        // If the condition is false, it will return 'tushar'
        System.out.println(tushar > nickel ? nickel : tushar);

        // In this case, since 10 is not greater than 12, it will print the value of 'tushar', which is 10.
    }
}

