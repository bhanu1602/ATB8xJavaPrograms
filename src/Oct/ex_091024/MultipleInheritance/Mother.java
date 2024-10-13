package Oct.ex_091024.MultipleInheritance;

public class Mother {

    // Mother class with two attributes: home and money (same as Father)
    String home = "Duplex";
    int money = 10000;

    // Method to set money for Mother
    void money(int money) {
        this.money = money;
        System.out.println("Mother has " + money + " money");
    }

    // Method to set home for Mother
    void home(String home) {
        this.home = home;
        System.out.println("Mother has " + home + " home");
    }
}
