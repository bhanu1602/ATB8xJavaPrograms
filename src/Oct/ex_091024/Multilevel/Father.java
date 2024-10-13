package Oct.ex_091024.Multilevel;

public class Father extends GrandFather {

    // Method overriding: Father's version of the home() method
    @Override
    void home() {
        System.out.println("This is father's 2BHK home");
    }

    // Method overriding: Father's version of the money() method
    @Override
    void money() {
        System.out.println("This is father's 200k money");
    }

    // New method in Father class
    void car() {
        System.out.println("This is father's 200k car");
    }
}
