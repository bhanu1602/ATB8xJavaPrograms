package Oct.ex_091024.MultipleInheritance;

public class Father {

    // Father class with two attributes: home and money
    String home = "Duplex";
    int money = 10000;

    // Method to set money for Father
    void money(int money) {
        this.money = money;
        System.out.println("Father has " + money + " money");
    }

    // Method to set home for Father
    void home(String home) {
        this.home = home;
        System.out.println("Father has " + home + " home");
    }
}
