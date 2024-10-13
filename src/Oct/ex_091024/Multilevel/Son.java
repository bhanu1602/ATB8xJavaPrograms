package Oct.ex_091024.Multilevel;


public class Son extends Father {

    // Method overriding: Son's version of the home() method
    @Override
    void home() {
        System.out.println("This is my 4BHK home");
    }

    // Method overriding: Son's version of the money() method
    @Override
    void money() {
        System.out.println("This is my 100k money");
    }
}
